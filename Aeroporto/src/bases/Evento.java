package bases;

public class Evento {

	public void Decisao(Fila pousar, Fila decolar) {
		if (decolar.getTamanho() > pousar.getTamanho() && pousar.getInicio().getCombustivel() > 1) {
			decolar.removeInicio();
			return;
		}
		
		if (decolar.getTamanho() > pousar.getTamanho() && pousar.getInicio().getCombustivel() == 1) {
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
		
		if (decolar.getTamanho() == pousar.getTamanho() && pousar.getInicio().getCombustivel() == 1) {
			pousar.removeInicio();
			return;
		}
		
		if (pousar.getTamanho() > decolar.getTamanho() && pousar.getInicio().getCombustivel() == 1) {
			pousar.removeInicio();
			return;
		}

	}
	
}
