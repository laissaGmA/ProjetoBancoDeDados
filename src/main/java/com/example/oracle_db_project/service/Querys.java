package com.example.oracle_db_project.service;

import com.example.oracle_db_project.dtos.QueryDois;
import com.example.oracle_db_project.dtos.QueryUm;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    public List<QueryDois> queryDois() {
        String sql = """
                    SELECT DISTINCT c.name, c.CREDIT_LIMIT, c.CITY, c.STATE
                    FROM
                        CLIENT c
                    WHERE
                        c.COUNTRY = 'United States'
                        AND NOT EXISTS (
                            SELECT *
                            FROM
                                DEMAND d2
                                JOIN ORDER_PRODUCT op ON d2.ORDER_ID = op.ORDER_ID
                                JOIN PRODUCT p ON p.PRODUCT_ID = op.PRODUCT_ID
                                JOIN CATEGORY cat ON cat.CATEGORY_ID = p.FK_CATEGORY_ID
                            WHERE
                                c.CLIENT_ID = d2.CLIENT_ID
                                AND c.NAME = 'Smartphone'
                        )
                        AND NOT EXISTS (
                            SELECT *
                            FROM
                                DEMAND d3
                                JOIN ORDER_PRODUCT op2 ON op2.ORDER_ID = d3.ORDER_ID
                            WHERE
                                c.CLIENT_ID = d3.CLIENT_ID
                            GROUP BY
                                d3.ORDER_ID
                            HAVING
                                SUM(op2.QUANTITY * op2.PRICE) <= 1000
                        )
                        AND c.CLIENT_ID IN (
                            SELECT c1.CLIENT_ID
                            FROM
                                CLIENT c1
                                JOIN DEMAND d ON d.CLIENT_ID = c1.CLIENT_ID
                            GROUP BY
                                c1.CLIENT_ID
                            HAVING
                                COUNT(*) > 4
                        )
                    """;

        Query query = entityManager.createNativeQuery(sql);

        List<Object[]> results = query.getResultList();
        List<QueryDois> queryDoisList = new ArrayList<>();

        for (Object[] result : results) {
            QueryDois queryDois = new QueryDois();
            queryDois.name = (String) result[0];
            queryDois.credit_limit = (BigDecimal) result[1];
            queryDois.city = (String) result[2];
            queryDois.state = (String) result[3];
            queryDoisList.add(queryDois);
        }

        return queryDoisList;
    }
}
