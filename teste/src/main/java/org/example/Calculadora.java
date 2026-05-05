package org.example;

public class Calculadora {

    public double somar(double a, double b){
        return a + b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double divisao(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Erro");
        }
        return a / b;
    }

    public double multiplicacao(double a, double b){
        return a * b;
    }

    public double subtracaosomar(double a, double b) {
        return b - a;
    }
}