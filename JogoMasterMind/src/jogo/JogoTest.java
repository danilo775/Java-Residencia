package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import configuracoes.Configuracao;

class JogoTest {

	@Test
	void testSetSenha() throws Exception {
		Configuracao configuracao = new Configuracao();
		configuracao.setAlfabeto("ABCDE");
		configuracao.setNome("Teste");
		configuracao.setMaxTentativas(5);
		configuracao.setTamanhoSenha(3);
		
		//caso geral: criar um jogo com uma senha v�lida
		Jogo jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("ABC");
		} catch (Exception e) {
			fail("N�o deveria gerar exception");
		}
		//a senha deve estar definida corretamete
		assertEquals("ABC", jogo.getSenha());
		
		//caso 1: criar uma senha com tamanho maior que o definido na configura��o
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("ABCD");
		} catch (Exception e) {
			assertEquals("A senha deve ter 3 caracteres", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("ABCD", jogo.getSenha());
		
		//caso 1 vers�o 2: criar uma senha com tamanho menor que o definido na configura��o
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("AB");
		} catch (Exception e) {
			assertEquals("A senha deve ter 3 caracteres", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("AB", jogo.getSenha());
		
		//para o caso 2: o tamanho da senha deve ser 4
		configuracao.setTamanhoSenha(4);
		
		//caso 2: vers�o 1. criar senha com caracteres repetidos no come�o
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("AACD");
		} catch (Exception e) {
			assertEquals("A senha n�o pode ter caracteres repetidos", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("AACD", jogo.getSenha());
		
		//caso 2: vers�o 2. criar senha com caracteres repetidos no fim
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("ABDD");
		} catch (Exception e) {
			assertEquals("A senha n�o pode ter caracteres repetidos", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("ABDD", jogo.getSenha());
		
		//caso 2: vers�o 3. criar senha com caracteres repetidos no come�o e no meio
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("ABAD");
		} catch (Exception e) {
			assertEquals("A senha n�o pode ter caracteres repetidos", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("ABAD", jogo.getSenha());
		
		//caso 2: vers�o 4. criar senha com caracteres repetidos no meio e no fim
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("ABCB");
		} catch (Exception e) {
			assertEquals("A senha n�o pode ter caracteres repetidos", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("ABCB", jogo.getSenha());
		
		//caso 3: gerar senha com caracteres que n�o est�o no alfabeto
		jogo = new Jogo(configuracao);
		try {
			jogo.setSenha("ABTD");
		} catch (Exception e) {
			assertEquals("A senha precisa ser composta apenas pelos caracteres ABCDE", e.getMessage());
		} 
		//n�o pode ter cadastrado a senha
		assertNotEquals("ABTD", jogo.getSenha());
	}
	
	//Caso de teste para tentativas inv�lidas
	@Test
	public void testRecebeTentativa() throws Exception {
		Configuracao configuracao = new Configuracao();
		configuracao.setAlfabeto("ABCDEFGHIJ");
		configuracao.setNome("Teste");
		configuracao.setMaxTentativas(5);
		configuracao.setTamanhoSenha(5);
		String ver;
		
		//caso geral: uma tentativa v�lida
		ver = "";
		Jogo jogo = new Jogo(configuracao);
		jogo.setSenha("ABCDE");
		try {
			ver = jogo.recebeTentativa("ABCDE");
		} catch (Exception e) {
			fail("N�o deveria ter gerado exce��o");
		}
		
		//caso 1: uma tentativa com menos caracteres do que o tamanho da senha
		ver = "";
		try {
			ver = jogo.recebeTentativa("ABCE");
		} catch (Exception e) {
			assertEquals("Senha deve ter 5 caracteres", e.getMessage());
		}
		//o valor da String ver n�o pode ter mudado
		assertEquals("", ver);
		
		//caso 2: uma tentativa com mais caracteres do que o tamanho da senha
		ver = "";
		try {
			ver = jogo.recebeTentativa("ABCEFG");
		} catch (Exception e) {
			assertEquals("Senha deve ter 5 caracteres", e.getMessage());
		}
		//o valor da String ver n�o pode ter mudado
		assertEquals("", ver);
		
		//caso 3: uma tentativa com caracteres que n�o est�o no alfabeto (ABCDEFGHIJ)
		ver = "";
		try {
			ver = jogo.recebeTentativa("ABKDE");
		} catch (Exception e) {
			assertEquals("A senha deve respeitar os caractares v�lidos da configura��o: ABCDEFGHIJ", e.getMessage());
		}
		//o valor da String ver n�o pode ter mudado
		assertEquals("", ver);
		
		//caso 4: uma tentativa com caracteres que se repetem
		ver = "";
		try {
			ver = jogo.recebeTentativa("ABADE");
		} catch (Exception e) {
			assertEquals("A senha n�o pode ter caracteres repetidos", e.getMessage());
		}
		//o valor da String ver n�o pode ter mudado
		assertEquals("", ver);
	}
	
	
	//Caso de teste para tentativas v�lidas (tamanho e repeti��o de caracteres
	@Test
	public void testRecebeTentativa2() throws Exception {
		
		Configuracao configuracao = new Configuracao();
		configuracao.setAlfabeto("ABCDEFGHIJ");
		configuracao.setNome("Teste");
		configuracao.setMaxTentativas(5);
		configuracao.setTamanhoSenha(5);
		
		//caso geral: uma tentativa correta
		Jogo jogo = new Jogo(configuracao);
		jogo.setSenha("ABCDE");
		String ver = "ABCDE";
		assertEquals("XXXXX", jogo.recebeTentativa(ver));
		
		//caso 1: uma tentativa com 1 caracteres em posi��o errada E 0 em posi��o certa
		ver = "BFGHI";
		assertEquals("O____", jogo.recebeTentativa(ver));
		
		//caso 2: uma tentativa com 3 caracteres em posi��o errada E 0 em posi��o certa
		ver = "BCHID";
		assertEquals("OO__O", jogo.recebeTentativa(ver));
		
		//caso 3: uma tentativa com 1 caracteres em posi��o certa E 0 em posi��o errada
		ver = "AFGHI";
		assertEquals("X____", jogo.recebeTentativa(ver));
		
		//caso 4: uma tentativa com 1 caracteres em posi��o errada E 1 em posi��o certa
		ver = "BFGDI";
		assertEquals("O__X_", jogo.recebeTentativa(ver));
		
		//caso 5: uma tentativa com 3 caracteres em posi��o certa e 0 em posi��o errada 
		ver = "FBCHE";
		assertEquals("_XX_X", jogo.recebeTentativa(ver));
		
		//caso 6: uma tentativa com todos os caracteres em posi��o errada
		ver = "EABCD";
		assertEquals("OOOOO", jogo.recebeTentativa(ver));
		
		//caso 7: uma tentativa com 4 caracteres em posi��o certa E 0 em posi��o errada
		ver = "ABCHE";
		assertEquals("XXX_X", jogo.recebeTentativa(ver));
	}

}
