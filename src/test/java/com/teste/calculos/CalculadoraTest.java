package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSome() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		double resultado = calc.soma(valor1, valor2);
		double soma = calc.soma(valor1,valor2);

		
		assertEquals( esperado,resultado, "5 + 5 não gerou o valor 10");
		
	}
	@Test
	@DisplayName("Teste 5 / 5 = 1")
	void testDiv() {
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 1D;
		
		
		double div = calc.div(valor1, valor2);
		double resultado = calc.div(valor1, valor2);
		
		assertEquals(esperado,resultado, "5 + 5 não gerou o valor 1");
		
		
	}
	@Test
	@DisplayName("Teste 5 - 5 = 0")
	void testSub() {
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 0D;
		
		double div = calc.div(valor1, valor2);
		double resultado = calc.sub(valor1, valor2);
		
		assertEquals(esperado,resultado, "5 + 5 não gerou o valor 0");
		
		
	}
	@Test
	@DisplayName("Teste 5 * 5 = 25")
	void testMult() {
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 25D;
		
		double div = calc.div(valor1, valor2);
		double resultado = calc.mult(valor1, valor2);
		
		assertEquals(esperado,resultado, "5 + 5 não gerou o valor 25");
		
		
	}

}
