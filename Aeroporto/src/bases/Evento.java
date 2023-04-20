package bases;

public class Evento {

	public void Decisao(Fila pousar, Fila decolar) {
		
		if (pousar.getTamanho() >= 2) {
			if (pousar.getInicio().getCombustivel() == 1 && pousar.getInicio().getProx().getCombustivel() == 1) {
				pousar.removeInicio();
				pousar.removeInicio();
				return;
			}
		}
		
		if (decolar.getTamanho() > 0 && pousar.getTamanho() > 0) {
			if (decolar.getTamanho() == pousar.getTamanho() && pousar.getInicio().getCombustivel() == 1) {
				pousar.removeInicio();
				return;
			}
		}
		
		if (pousar.getTamanho() <= 0 && decolar.getTamanho() <= 0) {
			return;
		}
		
		if (pousar.getTamanho() <= 0 && decolar.getTamanho() > 0) {
			decolar.removeInicio();
			return;
		}
		
		if (pousar.getTamanho() > 0 && decolar.getTamanho() <= 0) {
			pousar.removeInicio();
			return;
		}
		
		if (decolar.getTamanho() > pousar.getTamanho() && pousar.getTamanho() > 0 && pousar.getInicio().getCombustivel() > 1) {
			decolar.removeInicio();
			return;
		}
		
		if (decolar.getTamanho() > pousar.getTamanho() && pousar.getTamanho() > 0 && pousar.getInicio().getCombustivel() == 1) {
			pousar.removeInicio();
			return;
		}
		
		if (pousar.getTamanho() > decolar.getTamanho()) {
			pousar.removeInicio();
			return;
		}
			
		if (decolar.getTamanho() == pousar.getTamanho() && pousar.getInicio().getCombustivel() > 1) {
			decolar.removeInicio();
			return;
		}
		
		
		if (pousar.getTamanho() > decolar.getTamanho() && pousar.getInicio().getCombustivel() == 1) {
			pousar.removeInicio();
			return;
		}
		
	}
	
}
