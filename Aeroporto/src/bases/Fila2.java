package bases;

public class Fila2 {
	private Aviao2 inicio = null;
	private Aviao2 fim;
	private int tamanho = 0;
	
	public Fila2() {
		
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public Aviao2 getInicio() {
		if (!estaVazio()) {
			return inicio;
		}else {
			System.out.println("Fila Vazia");
			return null;
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	
	public void inserirInicio(Aviao2 aviao) {
		
		if (inicio != null) {
			inicio.setAnt(aviao);
			aviao.setProx(inicio);
		}
		
		inicio = aviao;
		if (fim == null) {
			fim = aviao;
		}
	}
	
	public void inserirFinal(Aviao2 aviao) {
		
		if (fim != null) {
			fim.setProx(aviao);
			aviao.setAnt(fim);
		}
		fim = aviao;
		if (inicio == null) {
			inicio = aviao;
			
		}
		
		tamanho++;
	}
	
	public void removeInicio() {
		Aviao2 aviaoRemovido = inicio;
		
		if (inicio == null) {
			return;
		}
		
		inicio = inicio.getProx();
		if (inicio != null) {
			inicio.setAnt(null);
		}
		
		if (aviaoRemovido == fim) {
			removeFinal();
		}
		tamanho--;
	}
	
	public void removeFinal() {
		Aviao2 aviaoRemovido = fim;
		
		if (fim == null) {
			return;
		}
		
		fim = fim.getAnt();
		if (fim != null) {
			fim.setProx(null);
		}
		
		if (aviaoRemovido == inicio) {
			removeInicio();
		}
		tamanho--;
	}
	
	public String mostrarLista() {
		String lista = "";
		if (inicio==null) {
			return lista;
		}
		
		Aviao2 aux = inicio;
		do {
			lista+= " * id : "+aux.getId()+" Combustivel: "+aux.getCombustivel()+" Tempo: "+aux.getTempo()+"\n";
			aux = aux.getProx();
		} while (aux!=null);
		return lista;
	}
	
	public void passarTempo() {
		Aviao2 aux = inicio;
		
		if (inicio == null) {
			return;
		}

		do {
			aux.setTempo(aux.getTempo()+1);
			aux = aux.getProx();
		} while (aux != null);
		
	}
	
	public void verificaCombustivel() {
		Aviao2 nodoRemovido = null;
		Aviao2 copia = null;
		Aviao2 aux = inicio;
		
		while (aux != null) {
			if (aux.getCombustivel() <= 2) {
				nodoRemovido = aux;
				copia = aux;
				break;
			}
			aux = aux.getProx();
		}
		
		if (nodoRemovido == null) {
			return;
		}
		
		if (nodoRemovido == inicio) {
			return;
		}else if (nodoRemovido == fim) {
			removeFinal();
			inserirInicio(copia);
		}else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
			inserirInicio(copia);
		}

	}

}
