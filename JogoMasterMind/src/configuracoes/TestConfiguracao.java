package configuracoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestConfiguracao {
	

	@Test
	void testSetAlfabeto() {
		Configuracao configuracao = new Configuracao();
		
		//Caso geral: salvar uma senha v�lida
		String alfabeto = "ABCDEFGH";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			fail("Gerou exce��o indevida");
			e1.printStackTrace();
		}
		assertEquals(alfabeto, configuracao.getAlfabeto());
		
		//*******************Caso 1: tentar inserir uma senha null
		alfabeto = null;
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
			assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
		}
		assertFalse(configuracao.getAlfabeto()==null);
		
		
		//*******************Caso 3: Tentar inserir uma senha com um �nico caractere
		alfabeto = "X";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
		}
		//temos que ter certeza que o string "X" n�o foi salvo
		assertFalse(configuracao.getAlfabeto()=="X");
		
		//*******************Caso 4: Tentar uma senha com caracteres repetidos
		//Caso 4.1 - Testar 2 caracteres iguais no come�o da String
		alfabeto = "AACDEFGHIJK";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
		
		//Caso 4.2 - Testar 2 caracteres iguais no final da String
		alfabeto = "ABCDEFGHIJJ";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
		
		//Caso 4.3 - Testar 2 caracteres iguais no final da String
		alfabeto = "ABCDEFGHIJA";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
		
		//Caso 4.4 - Testar 1 caracter intermedi�rio e outro no fim
		alfabeto = "ABCDKFGHIJK";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
		
		//Caso 4.5 - Testar 1 caracter intermedi�rio e outro no fim
		alfabeto = "ABCDEFGAIJK";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
		
		//Caso 4.6 - Testar 2 caracteres em posi��es intermedi�rias adjacentes
		alfabeto = "ABCDEFFHIJK";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
		
		//Caso 4.7 - Testar 2 caracteres em posi��es intermedi�rias n�o adjacentes
		alfabeto = "ABCDEFGHDJK";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem est� correta
						assertEquals("N�o podem haver caracteres repetidos no alfabeto", e.getMessage());
		}
		//temos que ter certeza que o string n�o foi salvo
		assertNotEquals(alfabeto, configuracao.getAlfabeto());
	}
	
	@Test
	void testSetTamanhoSenha() {
		Configuracao configuracao = new Configuracao();
		//definindo um alfabeto (o teste do m�todo que define o alfabeto j� existe!)
		String alfabeto = "abcd";
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Caso geral: um tamanho de senha v�lido (entre 1 e 4)
		int tam = 2;
		try {
			configuracao.setTamanhoSenha(tam);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			fail("N�o deveria gerar exception aqui");
			e1.printStackTrace();
		}
		assertEquals(tam, configuracao.getTamanhoSenha());
		
		//Caso 1: tentar inserir uma senha de tamanho negativo
		tam = -1;
		try {
			configuracao.setTamanhoSenha(tam);
		} catch (Exception e) {
			assertEquals("Senha deve ter ao menos 1 caracter", e.getMessage());
		}
		//o tamanho da senha n�o pode ter sido aceito
		assertNotEquals(tam, configuracao.getTamanhoSenha());
		
		//Caso 1 vers�o 2: tentar inserir uma senha de tamanho 0
		tam = 0;
		try {
			configuracao.setTamanhoSenha(tam);
		} catch (Exception e) {
			assertEquals("Senha deve ter ao menos 1 caracter", e.getMessage());
		}
		//o tamanho da senha n�o pode ter sido aceito
		assertNotEquals(tam, configuracao.getTamanhoSenha());
		
		//Caso 2: tentar inserir senha de tamanho maior que o alfabeto (que tem 4 caracteres)
		tam = 5;
		try {
			configuracao.setTamanhoSenha(tam);
		} catch (Exception e) {
			assertEquals("Senha n�o pode ser maior que o alfabeto (4 caracteres)", e.getMessage());
		}
		//o tamanho da senha n�o pode ter sido aceito
		assertNotEquals(tam, configuracao.getTamanhoSenha());
		
		//Caso 2 vers�o 2: inserir com sucesso senha de tamanho iguao ao alfabeto (que tem 4 caracteres)
		tam = 4;
		try {
			configuracao.setTamanhoSenha(tam);
		} catch (Exception e) {
			fail("N�o era para gerar exception aqui");
		}
		//o tamanho da senha precisa ter sido aceito
		assertEquals(tam, configuracao.getTamanhoSenha());
		
		//Caso 2 vers�o 3: tentar inserir senha de tamanho maior que o alfabeto (que agora tem 10 caracteres)
		try {
			configuracao.setAlfabeto("1234567890");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tam = 11;
		try {
			configuracao.setTamanhoSenha(tam);
		} catch (Exception e) {
			assertEquals("Senha n�o pode ser maior que o alfabeto (10 caracteres)", e.getMessage());
		}
		//o tamanho da senha n�o pode ter sido aceito
		assertNotEquals(tam, configuracao.getTamanhoSenha());
	}
	
	@Test
	public void testSetMaxTentativas() {
		Configuracao configuracao = new Configuracao();
		//caso geral: um n�mero qualquer de tentativas
		try {
			configuracao.setMaxTentativas(5);
		} catch (Exception e) {
			fail("N�o deveria gerar exception aqui");
		}
		//tem que ter aceitado o valor
		assertEquals(5, configuracao.getMaxTentativas());
		
		//Caso 1 vers�o 1: tentar inserir 0 tentativas
		try {
			configuracao.setMaxTentativas(0);
		} catch (Exception e) {
			assertEquals("Deve haver pelo menos 1 tentativa", e.getMessage());
		}
		//n�o pode ter aceitado
		assertNotEquals(0, configuracao.getMaxTentativas());
		
		//Caso 1 vers�o 2: tentar inserir menos que 0 tentativas
		try {
			configuracao.setMaxTentativas(-1);
		} catch (Exception e) {
			assertEquals("Deve haver pelo menos 1 tentativa", e.getMessage());
		}
		//n�o pode ter aceitado
		assertNotEquals(-1, configuracao.getMaxTentativas());
	}

}
