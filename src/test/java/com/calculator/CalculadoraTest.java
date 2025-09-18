package com.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    @DisplayName("Deve somar 5 e 3 resultando em 8")
    void deveSomarDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(5, 3);

        assertEquals(8, resultado);
    }

    @Test
    @DisplayName("Deve subtrair 10 e 4 resultando em 6")
    void deveSubtrairDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();

        int resultado = calc.subtrair(10, 4);

        assertEquals(6, resultado);
    }

    @Test
    @DisplayName("Deve subtrair 5 de 10 resultando em -5")
    void deveRetornarNegativoQuandoSubtraiMaiorDoMenor() {
        Calculadora calc = new Calculadora();

        int resultado = calc.subtrair(5, 10);

        assertEquals(-5, resultado);
    }
}