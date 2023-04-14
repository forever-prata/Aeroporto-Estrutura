package testes;
import bases.Aviao;
import bases.Fila;
public class FilasDeAvioes {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao(1,5);
		Aviao a2 = new Aviao(2,2);
		
		Fila pousar1 = new Fila();
		Fila decolar1 = new Fila();
		
		pousar1.inserir(a1);
		decolar1.inserir(a2);
		
		System.out.println(pousar1.mostrarLista());
		
		pousar1.passarTempo();
		
		System.out.println(pousar1.mostrarLista());
	}

}
