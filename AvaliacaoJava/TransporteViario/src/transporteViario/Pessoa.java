package transporteViario;

public class Pessoa {
	private static int contador = 0;
	 private int id;
	 private String nome;
	 private int idade;
	 private String cpf;
	    
	 public Pessoa(String nome, int idade, String cpf) {
		    this.id = id;
		    this.nome = nome;
		    this.idade = idade;
	    
		    if (cpf.matches("\\d+")) {
		      
		      if (cpf.length() == 11) {
		        this.cpf = cpf;
		      } else {
		        throw new IllegalArgumentException("O CPF deve ter 11 dígitos.");
		      }
		    } else {
		      throw new IllegalArgumentException("O CPF deve conter apenas dígitos numéricos.");
		    }
		  }
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	  
	  
	  
}
