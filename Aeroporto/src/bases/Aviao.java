package bases;

public class Aviao {
	
	private static int proximoId = 0;
	private int id;
	private int combustivel;
	private Aviao prox;
	private Aviao ant;
	
	public Aviao() {
	      this.id = proximoId;
	      proximoId += 2;
	      this.prox = null;
	      ant = null;
	}
	
	public Aviao(int combustivel) {
	    this.id = proximoId;
	    proximoId += 2;
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
	
	public Aviao getAnt() {
		return ant;
	}

	public void setAnt(Aviao ant) {
		this.ant = ant;
	}
}
