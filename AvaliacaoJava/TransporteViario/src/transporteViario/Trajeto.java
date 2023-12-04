package transporteViario;
import java.util.List;

class Trajeto {
	private Checkpoint checkpoint;
    private List<Trecho> trechos;
	public Trajeto(Checkpoint checkpoint, List<Trecho> trechos) {
		super();
		this.checkpoint = checkpoint;
		this.trechos = trechos;
	}
	public Checkpoint getCheckpoint() {
		return checkpoint;
	}
	public void setCheckpoint(Checkpoint checkpoint) {
		this.checkpoint = checkpoint;
	}
	public List<Trecho> getTrechos() {
		return trechos;
	}
	public void setTrechos(List<Trecho> trechos) {
		this.trechos = trechos;
	}
   
}
