package testes;
import bases.Aviao;
import bases.Evento;
import bases.Fila;
public class FilasDeAvioes {

	public static void main(String[] args) {
		Evento e = new Evento();
		
		Aviao a1 = new Aviao(5);
		Aviao a2 = new Aviao(2);
		Aviao a3 = new Aviao(6);
		Aviao a4 = new Aviao(7);
		Aviao b1 = new Aviao(5);
		Aviao b2 = new Aviao(2);
		Aviao b3 = new Aviao(6);
		Aviao b4 = new Aviao(7);
		
		Fila pousar1 = new Fila();
		Fila decolar1 = new Fila();
		
		pousar1.inserirFinal(a1);
		pousar1.inserirFinal(a2);
		pousar1.inserirFinal(a3);
		pousar1.inserirFinal(a4);
		
		decolar1.inserirFinal(b1);
		decolar1.inserirFinal(b2);
		decolar1.inserirFinal(b3);
		decolar1.inserirFinal(b4);
		
		System.out.println("LISTA DE POUSO");
		System.out.println(pousar1.mostrarLista());
		System.out.println("LISTA DE DECOLAR");
		System.out.println(decolar1.mostrarLista());
		
		pousar1.passarTempo();
		e.Decisao(pousar1, decolar1);
		
		System.out.println("LISTA DE POUSO");
		System.out.println(pousar1.mostrarLista());
		System.out.println("LISTA DE DECOLAR");
		System.out.println(decolar1.mostrarLista());
		
		pousar1.passarTempo();
		e.Decisao(pousar1, decolar1);
		
		System.out.println("LISTA DE POUSO");
		System.out.println(pousar1.mostrarLista());
		System.out.println("LISTA DE DECOLAR");
		System.out.println(decolar1.mostrarLista());
		
	}

}
