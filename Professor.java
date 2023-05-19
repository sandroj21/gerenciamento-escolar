public final class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
		return disciplina;
	}




	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}




	public Professor(String n, int m, String d) {
        this.setNome(n);
        this.setMatricula(m);
        this.disciplina = d;
    }
    
    
    

    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Disciplina: " + this.disciplina);
    }
}
