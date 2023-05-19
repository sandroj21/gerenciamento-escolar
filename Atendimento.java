public class Atendimento {
	private String aluno;
	private String professor;
	private String duvida;
	
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getProf() {
		return professor;
	}

	public void setProf(String prof) {
		this.professor = prof;
	}

	public String getDuvida() {
		return duvida;
	}

	public void setDuvida(String duvida) {
		this.duvida = duvida;
	}

	public Atendimento(String na, String np, String d) {
		this.aluno = na;
		this.professor = np;
		this.duvida = d;	
	}
	
	public void imprimir() {
		System.out.println("Aluno: " + this.getAluno());
		System.out.println("Professor solicitado: " + this.getProf());
		System.out.println("Dúvida: " + this.getDuvida());
	}
}
