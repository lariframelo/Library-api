package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void deveSomarDoisNumeros() {
        //cenário
        Calculadora calculadora = new Calculadora();
        int num1 = 10, num2 = 5;

        //execução
        int resultado = calculadora.somar(10, 5);

        //verificações
        Assert.assertEquals(15, resultado);


        }
    }


    class Calculadora {

        int somar(int num1, int num2) {
            if (num1 < 0 || num2 < 0) {
                throw new RuntimeException("Não é permitido números negativos");
            }
            return num1 + num1;
        }

        int multiplicar(int num1, int num2) {
            return num1 * num2;
        }

        double dividir(double doub1, double doub2) {
            return doub1 / doub2;
        }

        int subtrair(int num1, int num2) {
            return num1 - num2;
        }


    }

}