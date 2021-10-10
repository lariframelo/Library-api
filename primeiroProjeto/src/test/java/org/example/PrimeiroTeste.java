package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void estruturaDeUmTeste () {
    //cenário
    int num1 = 10, num2 = 5;

    //execução
    int resultado = num1 + num2;

    //verificações
        Assert.assertEquals(15, resultado);
    }
}
