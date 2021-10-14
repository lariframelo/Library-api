package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void deveSomarDoisNumeros() {
        //cenário
        int num1 = 10, num2 = 5;

        //execução
        int resultado = num1 + num2;

        //verificações
        Assert.assertEquals(15, resultado);

        @Test
        public void naoDeveSomarNumerosNegativos() {
            //cenário
            Calculadora calculadora = new Calculadora();
            int numA = -10;
            int numB = 5;
        }
    }


    class Calculadora {

        int somar(int num1, int num2) {
            return num1 + num1;
        }



    }

}