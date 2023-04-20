package bases;

public class Fila {
	private Aviao inicio = null;
	private Aviao fim;
	private int tamanho = 0;
	
	public Fila() {
		
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public Aviao getInicio() {
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

	
	public void inserirInicio(Aviao aviao) {
		
		if (inicio != null) {
			inicio.setAnt(aviao);
			aviao.setProx(inicio);
		}
		
		inicio = aviao;
		if (fim == null) {
			fim = aviao;
		}
		
		tamanho++;
	}
	
	public void inserirFinal(Aviao aviao) {
		
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
		Aviao aviaoRemovido = inicio;
		
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
		Aviao aviaoRemovido = fim;
		
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
		
		Aviao aux = inicio;
		do {
			lista+= "id : "+aux.getId()+" Combustivel: "+aux.getCombustivel()+"\n";
			aux = aux.getProx();
		} while (aux!=null);
		return lista;
	}
	
	public void passarTempo() {
		Aviao aux = inicio;
		
		if (inicio == null) {
			return;
		}

		do {
			aux.setCombustivel(aux.getCombustivel()-1);
			aux = aux.getProx();
		} while (aux != null);
		
		verificaCombustivel();
	}
	
	public void verificaCombustivel() {
		Aviao nodoRemovido = null;
		Aviao aux = inicio;
		
		while (aux != null) {
			if (aux.getCombustivel() == 1) {
				nodoRemovido = aux;
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
			inserirInicio(aux);
		}else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
			inserirInicio(aux);
		}

	}

}
