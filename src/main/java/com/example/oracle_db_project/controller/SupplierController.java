package com.example.oracle_db_project.controller;

import com.example.oracle_db_project.model.Supplier;
import com.example.oracle_db_project.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public String getAllSuppliers(Model model) {
        List<Supplier> suppliers = supplierService.getAllSuppliers();
        model.addAttribute("suppliers", suppliers);
        return "suppliers";
    }

    @GetMapping("/new")
    public String showNewSupplierForm(Model model) {
        model.addAttribute("supplier", new Supplier());
        return "supplier-form";
    }

    @PostMapping
    public String saveSupplier(@ModelAttribute Supplier supplier) {
        supplierService.saveSupplier(supplier);
        return "redirect:/suppliers";
    }
}
