package dto;

public class EstudanteDTO {
	private String nome;
	private String matricula;
	private String nomeCurso;
	
	public EstudanteDTO() {
		super();
	}

	public EstudanteDTO(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
