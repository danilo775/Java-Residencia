package testes;

import dao.ImovelDAO;
import model.Imovel;

public class Teste {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Juca");
//	    cliente.setCpf("123.456.789-11");		
		//ClienteDAO.create(cliente);		
		//System.out.println(ClienteDAO.readAll().get(0).getNome());
		//System.out.println(ClienteDAO.readById("1").getNome());		
		//ClienteDAO.update(cliente);
	
		Imovel imovel = new Imovel("1232346","Rua A",223238,5987);
		imovel.setIdCliente(1);
		ImovelDAO.create(imovel);
		
	}
}
