package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        int resultado = calculadora.somar(num1, num2);
        int resultadoSubtracao = calculadora.subtrair(num1, num2);
        System.out.println("O resultado da soma é: " + resultado);
        System.out.println("O resultado da subtração é: " + resultadoSubtracao);
    }
}
