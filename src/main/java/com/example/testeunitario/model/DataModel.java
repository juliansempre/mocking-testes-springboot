package com.example.testeunitario.model;

import org.springframework.stereotype.Component;

@Component
public class DataModel implements DataModelInterface {
    public String vercalculo() {
        System.out.println("testando");

        int resultado = calculo(2, 3);
        String resultadoTexto = "A soma de 2+3 é: " + resultado;

        return resultadoTexto;
    }

    public int calculo(int x, int y) {
        return x + y;
    }
}
