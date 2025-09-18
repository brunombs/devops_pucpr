package com.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    @DisplayName("Deve somar 18 e 24 resultando em 42")
    void deveSomarDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(18, 24);
        assertEquals(42, resultado);
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

    @Test
    @DisplayName("Teste de falha: Deve somar 2 e 2 e esperar 5")
    void deveFalharAoSomarIncorretamente() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(2, 2);

        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste de falha: Deve somar 2 e 2 e esperar 5")
    void deveFalharAoSubtrairIncorretamente() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(2, 2);

        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste para dar resultado errado, mas não falhar")
    void naoDeveFalhar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(2, 2);

        assertNotEquals(5, resultado);
    }
}