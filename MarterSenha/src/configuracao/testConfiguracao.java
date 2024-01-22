package configuracao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testConfiguracao {

	@Test
	void testSetAlfabeto() throws Exception{
		Configuracao configuracao = new Configuracao();
		String senha = "ACDEFGHIJ";
		configuracao.setAlfabeto(senha);
		assertEquals(senha,configuracao.getAlfabeto());
	
		
	//***********caso 1 : tentar enserir uma Senha null
	
	senha = null;
	
	try {
		configuracao.setAlfabeto(senha);
	}catch(Exception e) {
		assertEquals("O alfabeto deve ser nullo", e.getMessage());
	}
	assertFalse(configuracao.getAlfabeto()==null);
			
	//***********caso 2 : tentar enserir uma Senha 1 caracter
	
	senha = "A";
	try {
		configuracao.setAlfabeto(senha);
	}catch(Exception e) {
		assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
	}
	assertFalse(configuracao.getAlfabeto()==null);
	
	}
	
}