package com.example.testeunitario.controller;

import com.example.testeunitario.model.DataModelInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    private DataModelInterface dataModel;

    public TesteController(DataModelInterface dataModel) {
        this.dataModel = dataModel;
    }

    @GetMapping("/")
    public String index() {
        return "Olá mundo, com o Spring Boot";
    }

    @GetMapping("/teste")
    public String resultado() {
        String soma = dataModel.vercalculo();
        return "" + soma;
    }
}
