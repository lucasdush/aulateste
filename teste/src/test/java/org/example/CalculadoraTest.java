package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        double c = calc.somar(1, 3);
        assertEquals(4, c, 0.0001);
    }

    @Test
    public void testSubtrair() {
        assertEquals(3, calc.subtrair(5, 2), 0.0001);
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(12, calc.multiplicacao(4, 3), 0.0001);
    }

    @Test
    public void testDivisao() {
        assertEquals(5, calc.divisao(10, 2), 0.0001);
    }

    @Test
    public void testMultiplicacaoDecimal() {
        assertEquals(5.0, calc.multiplicacao(2.5, 2), 0.0001);
    }

    @Test
    public void testSubtracaoSomar() {
        assertEquals(1, calc.subtracaosomar(2, 3), 0.0001);
    }

    @Test
    public void testDivisaoPorZero() {
Double RES = calc.divisao(10,0);
        assertEquals("ERRO",RES);
    }
}