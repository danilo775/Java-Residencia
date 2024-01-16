package cliente;

public class Cliente {
	private String nome;
	private String cpf;
	private String cnh;
	
	
	public Cliente(String nome, String cpf, String cnh) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	
}
