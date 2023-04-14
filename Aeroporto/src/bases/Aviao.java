package bases;

public class Aviao {
	
	private int id;
	private int combustivel;
	private Aviao prox;
	
	public Aviao(int id) {
		this.id = id;
		this.prox = null;
	}
	
	public Aviao(int id, int combustivel) {
		this.id = id;
		this.combustivel = combustivel;
		this.prox = null;
	}
	
	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aviao getProx() {
		return prox;
	}

	public void setProx(Aviao prox) {
		this.prox = prox;
	}
	
	
}
