package bases;

public class Aviao2 {
	
	private static int proximoId = 1;
	private int id;
	private int combustivel = 0;
	private float tempo;
	private Aviao2 prox;
	private Aviao2 ant;
	
	public Aviao2() {
	      this.id = proximoId;
	      proximoId += 2;
	      this.prox = null;
	      ant = null;
	      this.tempo = 0;
	}
	
	public Aviao2(int combustivel) {
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

	public Aviao2 getProx() {
		return prox;
	}

	public void setProx(Aviao2 prox) {
		this.prox = prox;
	}
	
	public Aviao2 getAnt() {
		return ant;
	}

	public void setAnt(Aviao2 ant) {
		this.ant = ant;
	}

	public float getTempo() {
		return tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
}
