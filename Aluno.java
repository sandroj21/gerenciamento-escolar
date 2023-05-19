public final class Aluno extends Pessoa {
    private String endereco;
    private String turma;

    public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	String getEndereco() {
        return endereco;
    }

    void setEndereco(String e) {
        this.endereco = e;
    }

   public Aluno(String n, int m, String e, String t) {
        this.setNome(n);
        this.setMatricula(m);
        this.endereco = e;
        this.turma = t;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Turma: " + this.turma);
    }
}
