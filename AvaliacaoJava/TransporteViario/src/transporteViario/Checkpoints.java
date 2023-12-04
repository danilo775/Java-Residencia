package transporteViario;
import java.util.Date;

class Checkpoint {
    private PontoDeParada ponto;
    private Date horario;
   

    public Checkpoint(PontoDeParada ponto, Date horario) {
        this.ponto = ponto;
        this.horario = horario;
    }


	public PontoDeParada getPonto() {
		return ponto;
	}


	public void setPonto(PontoDeParada ponto) {
		this.ponto = ponto;
	}


	public Date getHorario() {
		return horario;
	}


	public void setHorario(Date horario) {
		this.horario = horario;
	}
    
}
