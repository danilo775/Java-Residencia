package transporteViario;

public class Motorista extends Pessoa {
	  private String cnh;

	 
	  public Motorista(String nome, int idade, String cpf, String cnh) {
	    super(nome, idade, cpf);
	    this.cnh = cnh;
	  }
 
	  public String getCnh() {
	    return cnh;
	  }

	  public void setCnh(String cnh) {
	    this.cnh = cnh;
	  }
	}