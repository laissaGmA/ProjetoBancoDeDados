package com.example.oracle_db_project.service;

import com.example.oracle_db_project.dtos.QueryUm;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Querys {

    @PersistenceContext
    private EntityManager entityManager;

    public List<QueryUm> queryUm() {
        String sql = """
                   SELECT
                       np.name AS nome,
                       dp.description AS descricao,
                       p.min_sale_price AS precoMinimo
                   FROM
                       PRODUCT p
                       JOIN NAME_PRODUCT np ON p.product_id = np.product_id AND np.name_language = 'English'
                       JOIN DESCRIPTION_PRODUCT dp ON p.product_id = dp.product_id AND dp.description_language = 'English'
                       JOIN SUPPLIER s ON p.fk_supplier_id = s.supplier_id
                       JOIN STOCK st ON p.product_id = st.product_id
                   WHERE
                       s.supplier_country = 'Japan'
                   GROUP BY
                       np.name, dp.description, p.min_sale_price
                   HAVING
                       SUM(st.quantity) > 20
                   """;

        Query query = entityManager.createNativeQuery(sql);

        List<Object[]> results = query.getResultList();
        List<QueryUm> queryUmList = new ArrayList<>();

        for (Object[] result : results) {
            String nome = (String) result[0];
            String descricao = (String) result[1];
            double precoMinimo = ((Number) result[2]).doubleValue();
            queryUmList.add(new QueryUm(nome, descricao, precoMinimo));
        }
        return queryUmList;
    }
}
