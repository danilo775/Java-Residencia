package transporteViario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jornada {
	  private Date inicio;
	  private Date fim;
	  private Trajeto trajetos;
	  private Motorista motorista;
	  private Cobrador cobrador;
	  private Veiculo veiculo;
	  private List<Passageiro> passageiros;

	 
	  public Jornada(Date inicio, Trajeto trajetos, Motorista motorista, Cobrador cobrador, Veiculo veiculo) {
	    this.inicio = inicio;
	    this.fim = null;
	    this.trajetos = trajetos;
	    this.motorista = motorista;
	    this.cobrador = cobrador;
	    this.veiculo = veiculo;
	    this.passageiros = new ArrayList<>();
	  }

	public Jornada(Date inicio, Trajeto trajetos, Motorista motorista, Veiculo veiculo, List<Passageiro> passageiros) {
		super();
		this.inicio = inicio;
		this.fim = null;
		this.trajetos = trajetos;
		this.motorista = motorista;
		this.cobrador = null;
		this.veiculo = veiculo;
		this.passageiros = passageiros;
	}
	
	public Jornada(Date inicio, Date fim, Trajeto trajetos, Motorista motorista, Cobrador cobrador, Veiculo veiculo,
			List<Passageiro> passageiros) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.trajetos = trajetos;
		this.motorista = motorista;
		this.cobrador = cobrador;
		this.veiculo = veiculo;
		this.passageiros = passageiros;
	}

	public Date getInicio() {
		return inicio;
	}


	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}


	public Date getFim() {
		return fim;
	}


	public void setFim(Date fim) {
		this.fim = fim;
	}


	public Trajeto getTrajetos() {
		return trajetos;
	}


	public void setTrajetos(Trajeto trajetos) {
		this.trajetos = trajetos;
	}


	public Motorista getMotorista() {
		return motorista;
	}


	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}


	public Cobrador getCobrador() {
		return cobrador;
	}


	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public List<Passageiro> getPassageiros() {
		return passageiros;
	}


	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}
    
	public void adicionarPassageiro(Passageiro passageiro) {
	    passageiros.add(passageiro);
	}

	public void removerPassageiro(Passageiro passageiro) {
	    passageiros.remove(passageiro);
	}  
    
    
}
