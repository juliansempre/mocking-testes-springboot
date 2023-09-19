package com.example.testeunitario;

import com.example.testeunitario.model.DataModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DataModelIntegrationTest {

    @Autowired
    private DataModel dataModel;

    @Test
    public void testVerCalculo() {
        String resultadoTexto = dataModel.vercalculo();
        assertEquals("A soma de 2+3 é: 5", resultadoTexto);
    }
    @Test
    public void testVerCalculoErroProposital() {
        String resultadoTexto = dataModel.vercalculo();
        assertEquals("A soma de 2+3 é: 7", resultadoTexto);
    }
}
