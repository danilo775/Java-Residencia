package model;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
	private Integer id;
	private String matricula;
	private String endereco;
	private float ultimaLeitura;
	private float penultimaLeitura;
	private Integer IdCliente = 0;
//	private List<Fatura> listaFaturas = new ArrayList<Fatura>();
//	private List<Falha> listaFalhas = new ArrayList<Falha>();
	
	public Imovel(String matricula, String endereco, float ultimaLeitura, float penultimaLeitura) {
		this.matricula = matricula;
		this.endereco = endereco;
		this.ultimaLeitura = ultimaLeitura;
		this.penultimaLeitura = penultimaLeitura;
	}
	public Imovel() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

	public String getMatricula() {
		return matricula;
	}

	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getUltimaLeitura() {
		return ultimaLeitura;
	}

	public void setUltimaLeitura(float ultimaLeitura) {
		this.ultimaLeitura = ultimaLeitura;
	}

	public float getPenultimaLeitura() {
		return penultimaLeitura;
	}

	public void setPenultimaLeitura(float penultimaLeitura) {
		this.penultimaLeitura = penultimaLeitura;
	}

//	public List<Fatura> getListaFaturas() {
//		return listaFaturas;
//	}
//
//	public void setListaFaturas(Fatura fatura) {
//		this.listaFaturas.add(fatura);
//	}
//
//	public List<Falha> getListaFalhas() {
//		return listaFalhas;
//	}
//
//	public void setListaFalhas(List<Falha> listaFalhas) {
//		this.listaFalhas = listaFalhas;
//	}
	
	
}
