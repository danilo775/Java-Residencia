package transporteViario;

class Trecho {
    private PontoDeParada origem;
    private PontoDeParada destino;
    private int intervaloEstimadoMinutos;
   

    public Trecho(PontoDeParada origem, PontoDeParada destino, int intervaloEstimadoMinutos) {
        this.origem = origem;
        this.destino = destino;
        this.intervaloEstimadoMinutos = intervaloEstimadoMinutos;
    }


	public PontoDeParada getOrigem() {
		return origem;
	}


	public void setOrigem(PontoDeParada origem) {
		this.origem = origem;
	}


	public PontoDeParada getDestino() {
		return destino;
	}


	public void setDestino(PontoDeParada destino) {
		this.destino = destino;
	}


	public int getIntervaloEstimadoMinutos() {
		return intervaloEstimadoMinutos;
	}


	public void setIntervaloEstimadoMinutos(int intervaloEstimadoMinutos) {
		this.intervaloEstimadoMinutos = intervaloEstimadoMinutos;
	}
    
}
