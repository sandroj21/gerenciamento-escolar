public abstract class Pessoa {
    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }
    
    public abstract void imprimir();
}