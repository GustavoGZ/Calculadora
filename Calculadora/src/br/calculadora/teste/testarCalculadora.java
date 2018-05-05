package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class testarCalculadora {

	@Test
	public void QuandoDoisNumerosForemFornecidosRetornarAForma() {
		//cenário 
		int a=2; 
		int b=6;
		Calculadora calculadora= new Calculadora();
		//acão 
		int resultadoObtido=calculadora.soma(a,b);
		//verificação
		assertEquals (a+b, resultadoObtido);
	}
	
	

}
