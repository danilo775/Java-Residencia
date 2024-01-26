package configuracao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestListaConfiguracao {

	@Test
	void testNovaConfiguracao() {

		
		Configuracao config1 = new Configuracao();
		config1.setNome("config1");
		Configuracao config2 = new Configuracao();
		config2.setNome("config2");
		Configuracao config3 = new Configuracao();
		config3.setNome("config3");			
		ListaConfiguracoes listaConfiguracoes = new ListaConfiguracoes();
		
		//caso geral: acrescentar uma lista perfeitamente v�lida
		assertEquals(0, listaConfiguracoes.getLista().size());
		try {
			listaConfiguracoes.novaConfiguracao(config1);
		}catch(Exception e1){
			fail("N�o deveria gerar exce��o");
		}
		try {
			listaConfiguracoes.novaConfiguracao(config2);
		}catch(Exception e1){
			fail("-gay deveria gerar exce��o");
		}
		try {
			listaConfiguracoes.novaConfiguracao(config3);
		}catch(Exception e1){
			fail("-gay deveria gerar exce��o");
		}
		assertEquals(3, listaConfiguracoes.getLista().size());
		assertEquals(0, listaConfiguracoes.getLista().get(0).getNome());
		assertEquals(1, listaConfiguracoes.getLista().get(1).getNome());
		assertEquals(2, listaConfiguracoes.getLista().get(2).getNome());
		
		ArrayList<Configuracao> lista = listaConfiguracoes.getLista();
		lista.add(config1);
		
		
		
		
		
		
	}
	
}
