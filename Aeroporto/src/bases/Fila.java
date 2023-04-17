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

	public void inserir(Aviao novo) {
			if (estaVazio()) {
				inicio = novo;
				fim = novo;
			}else {
				fim.setProx(novo);
				fim = novo;
			}
			tamanho++;
	}
	
	public void remover() {
		if (estaVazio()) {
			return;
		}
		
		inicio = inicio.getProx();
		tamanho--;
		
		if (estaVazio()) {
			fim = null;
		}
		
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
		Aviao aux = inicio;
		Aviao anterior = inicio;
		Aviao removido = null;
		Aviao inicioAntigo = inicio;
		
		if (aux != inicio) {
			anterior = anterior.getProx();
		}
		
		do {
			if (aux.getCombustivel() == 1) {
				removido = aux;
				anterior.setProx(aux.getProx());
			}
			aux = aux.getProx();
		} while (aux != null);
		
		inicio = removido;
		inicio.setProx(inicioAntigo);
		
	}

}
