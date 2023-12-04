package transporteViario;

public class Passageiro extends Pessoa {
	  private String tipoCartao;

	  public Passageiro(String nome, int idade, String cpf, String tipoCartao) {
	    super(nome, idade, cpf);
	    this.tipoCartao = tipoCartao;
	  }

	  public String getTipoCartao() {
	    return tipoCartao;
	  }

	  public void setTipoCartao(String tipoCartao) {
	    this.tipoCartao = tipoCartao;
	  }
	}
