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
        int resultado = calculadora.somar(num1,num2);

        //verificações


        }
    @Test (expected = RuntimeException.class)
    public void naoSomarDoisNumerosNegativos() {
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 = -10;
        int num2 = 5;

        //execução
        calculadora.somar(num1,num2);
}
    @Test
    public void multiplicarDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 10;

        calculadora.multiplicar(num1,num2);
    }

    @Test
    public void dividirDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 10;

        calculadora.dividir(num1,num2);
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