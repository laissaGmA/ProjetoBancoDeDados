package com.example.oracle_db_project.controller;


import com.example.oracle_db_project.dtos.QueryDois;
import com.example.oracle_db_project.dtos.QueryQuatro;
import com.example.oracle_db_project.dtos.QueryTres;
import com.example.oracle_db_project.dtos.QueryUm;
import com.example.oracle_db_project.service.Querys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class QueryController {

    @Autowired
    private Querys querys;

    @GetMapping("/")
    public String redirectToSpecificController() {
        return "redirect:/um";
    }

    @GetMapping("/um")
    public String queryUm(Model model) {
        List<QueryUm> queryUmList = querys.queryUm();
        model.addAttribute("queryUmList", queryUmList);
        return "queryUm";
    }

    @GetMapping("/dois")
    public String queryDois(Model model) {
        List<QueryDois> queryDoisList = querys.queryDois();
        model.addAttribute("queryDoisList", queryDoisList);
        return "queryDois";
    }

    @GetMapping("/tres")
    public String queryTres(Model model) {
        List<QueryTres> queryTresList = querys.queryTres();
        model.addAttribute("queryTresList", queryTresList);
        return "queryTres";
    }

    @GetMapping("/quatro")
    public String queryQuatro(Model model) {
        List<QueryQuatro> queryQuatroList = querys.queryQuatro();
        model.addAttribute("queryQuatroList", queryQuatroList);
        return "queryQuatro";
    }
}
