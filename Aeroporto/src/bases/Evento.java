package bases;

public class Evento {

	public Aviao Decisao(Fila pousar, Fila2 decolar) {
		Aviao aux  = new Aviao();
		if (pousar.getTamanho() <= 0 && decolar.getTamanho() <= 0) {
			return aux;
		}
		
		if (pousar.getTamanho() > 0) {
			if (pousar.getInicio().getCombustivel() <= 0) {
				aux.setId(pousar.getInicio().getId());
				aux.setTempo(pousar.getInicio().getTempo());
				pousar.removeInicio();
				return aux;
			}
		}
		
		if (pousar.getTamanho() >= 2) {
			if (pousar.getInicio().getCombustivel() == 1 && pousar.getInicio().getProx().getCombustivel() == 1) {
				pousar.removeInicio();
				pousar.removeInicio();
				return null;
			}
		}
		
		if (decolar.getTamanho() > 0 && pousar.getTamanho() > 0) {
			if (decolar.getTamanho() == pousar.getTamanho() && pousar.getInicio().getCombustivel() <= 2) {
				aux.setId(pousar.getInicio().getId());
				aux.setTempo(pousar.getInicio().getTempo());
				pousar.removeInicio();
				return aux;
			}else if (decolar.getTamanho() > pousar.getTamanho() && pousar.getInicio().getCombustivel() <= 2) {
				aux.setId(pousar.getInicio().getId());
				aux.setTempo(pousar.getInicio().getTempo());
				pousar.removeInicio();
				return aux;
			}else if (pousar.getTamanho() > decolar.getTamanho()) {
					aux.setId(pousar.getInicio().getId());
					aux.setTempo(pousar.getInicio().getTempo());
					pousar.removeInicio();
					return aux;
			}else if (decolar.getTamanho() == pousar.getTamanho() && pousar.getInicio().getCombustivel() > 2) {
				aux.setId(decolar.getInicio().getId());
				aux.setTempo(decolar.getInicio().getTempo());
				decolar.removeInicio();
				return aux;
			}
		}else if (decolar.getTamanho() > 0 && pousar.getTamanho()<=0) {
			aux.setId(decolar.getInicio().getId());
			aux.setTempo(decolar.getInicio().getTempo());
			decolar.removeInicio();
			return aux;
		}else if (pousar.getTamanho() > 0 && decolar.getTamanho() <= 0) {
			aux.setId(pousar.getInicio().getId());
			aux.setTempo(pousar.getInicio().getTempo());
			pousar.removeInicio();
			return aux;
		}
		
		if (decolar.getTamanho() == pousar.getTamanho() && pousar.getInicio().getCombustivel() > 1) {
			aux.setId(decolar.getInicio().getId());
			aux.setTempo(decolar.getInicio().getTempo());
			decolar.removeInicio();
			return aux;
		}
		
		if (pousar.getTamanho() <= 0 && decolar.getTamanho() > 0) {
			aux.setId(decolar.getInicio().getId());
			aux.setTempo(decolar.getInicio().getTempo());
			decolar.removeInicio();
			return aux;
		}
		
		if (pousar.getTamanho() > 0 && decolar.getTamanho() <= 0) {
			aux.setId(pousar.getInicio().getId());
			aux.setTempo(pousar.getInicio().getTempo());
			pousar.removeInicio();
			return aux;
		}
		
		if (decolar.getTamanho() > pousar.getTamanho() && pousar.getTamanho() > 0 && pousar.getInicio().getCombustivel() > 1) {
			aux.setId(decolar.getInicio().getId());
			aux.setTempo(decolar.getInicio().getTempo());
			decolar.removeInicio();
			return aux;
		}
		
		return aux;
	}
	
}
