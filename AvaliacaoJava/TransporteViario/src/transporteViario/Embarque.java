package transporteViario;

class Embarque {
    private Passageiro passageiro;
    private PontoDeParada pontoEmbarque;
   
    public Embarque(Passageiro passageiro, PontoDeParada pontoEmbarque) {
        this.passageiro = passageiro;
        this.pontoEmbarque = pontoEmbarque;
    }

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public PontoDeParada getPontoEmbarque() {
		return pontoEmbarque;
	}

	public void setPontoEmbarque(PontoDeParada pontoEmbarque) {
		this.pontoEmbarque = pontoEmbarque;
	}
    
}
