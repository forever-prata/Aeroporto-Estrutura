package bases;

public class Evento {

	public void Decisao(Fila pousar, Fila decolar) {
		if (decolar.getTamanho() > pousar.getTamanho() && pousar.getInicio().getCombustivel() > 1) {
			decolar.remover();
			return;
		}else {
			pousar.remover();
			return;
		}
		

	}
	
}
