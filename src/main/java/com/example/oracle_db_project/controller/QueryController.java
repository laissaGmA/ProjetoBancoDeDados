package com.example.oracle_db_project.controller;


import com.example.oracle_db_project.dtos.*;
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
    public String initialPage(Model model) {
        return "initial";
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

    @GetMapping("/cinco")
    public String queryCinco(Model model) {
        List<QueryCinco> queryCincoList = querys.queryCinco();
        model.addAttribute("queryCincoList", queryCincoList);
        return "queryCinco";
    }

    @GetMapping("/seis")
    public String querySeis(Model model) {
        List<QuerySeis> querySeisList = querys.querySeis();
        model.addAttribute("querySeisList", querySeisList);
        return "querySeis";
    }

    @GetMapping("/sete")
    public String querySete(Model model) {
        List<QuerySete> querySeteList = querys.querySete();
        model.addAttribute("querySeteList", querySeteList);
        return "querySete";
    }

    @GetMapping("/oito")
    public String queryOito(Model model) {
        List<QueryOito> queryOitoList = querys.queryOito();
        model.addAttribute("queryOitoList", queryOitoList);
        return "queryOito";
    }

    @GetMapping("/nove")
    public String queryNove(Model model) {
        List<QueryNove> queryNoveList = querys.queryNove();
        model.addAttribute("queryNoveList", queryNoveList);
        return "queryNove";
    }

    @GetMapping("/dez")
    public String queryDez(Model model) {
        List<QueryDez> queryDezList = querys.queryDez();
        model.addAttribute("queryDezList", queryDezList);
        return "queryDez";
    }
}
