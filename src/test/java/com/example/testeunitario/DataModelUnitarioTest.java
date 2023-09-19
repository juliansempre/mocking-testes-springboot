package com.example.testeunitario;

import com.example.testeunitario.model.DataModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DataModelUnitarioTest {

    @InjectMocks
    private DataModel dataModel;

    @BeforeEach
    public void setUp() {
        // Configuração de objetos mock, se necessário
        // Remove o stubbing desnecessário daqui
    }

    @Test
    public void testVerCalculo() {
        // Chame o método vercalculo()
        String resultado = dataModel.vercalculo();

        // Verifique se o resultado é o esperado
        assertEquals("A soma de 2+3 é: 5", resultado);
    }

    @Test
    public void testCalculo() {
        // Chame o método calculo()
        int resultado = dataModel.calculo(2, 3);

        // Verifique se o resultado é o esperado
        assertEquals(5, resultado);
    }
    @Test
    public void testCalculoErroProposital() {
        // Chame o método calculo()
        int resultado = dataModel.calculo(2, 3);

        // Verifique se o resultado é o esperado
        assertEquals(7, resultado);
    }
}
