package com.calculator;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5, 3);
        System.out.printf("O resultado da soma é: " + resultado);
    }
}
