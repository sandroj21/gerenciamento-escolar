
public class MinhaExce��o extends Exception {

	private int num;
	public MinhaExce��o(int num) {
		super();
		this.num = num;
		
	}
	public String toString() {
		return "Erro de quantidade de d�gitos excessivos";
	}
}
