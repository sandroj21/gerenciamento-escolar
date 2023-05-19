
public class MinhaExceção extends Exception {

	private int num;
	public MinhaExceção(int num) {
		super();
		this.num = num;
		
	}
	public String toString() {
		return "Erro de quantidade de dígitos excessivos";
	}
}
