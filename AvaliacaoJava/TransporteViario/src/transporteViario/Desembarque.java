package transporteViario;

class Desembarque {
    private Passageiro passageiro;
    private PontoDeParada pontoDesembarque;
    
    public Desembarque(Passageiro passageiro, PontoDeParada pontoDesembarque) {
        this.passageiro = passageiro;
        this.pontoDesembarque = pontoDesembarque;
    }

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public PontoDeParada getPontoDesembarque() {
		return pontoDesembarque;
	}

	public void setPontoDesembarque(PontoDeParada pontoDesembarque) {
		this.pontoDesembarque = pontoDesembarque;
	}
    
    
}
