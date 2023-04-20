package testes;
import java.util.Random;

import bases.Aviao;
import bases.Evento;
import bases.Fila;
public class FilasDeAvioes {

	public static void main(String[] args) {
		Evento e = new Evento();
		Fila pousar1 = new Fila();
		Fila decolar1 = new Fila();
		Random gerador = new Random();
		
		int qtd = gerador.nextInt(3);
		
		for (int i = 0; i < qtd; i++) {
			int combustivel = gerador.nextInt(7);
			Aviao aux = new Aviao(combustivel+1);
			pousar1.inserirFinal(aux);
		}
		
		for (int i = 0; i < qtd; i++) {
			int combustivel = gerador.nextInt(7);
			Aviao aux = new Aviao(combustivel+1);
			decolar1.inserirFinal(aux);
		}
		
		System.out.println("LISTA DE POUSO");
		System.out.println(pousar1.mostrarLista());
		System.out.println("LISTA DE DECOLAR");
		System.out.println(decolar1.mostrarLista());
		System.out.println("--------------------------------");
		
		for (int i = 0; i < 5; i++) {
			
			pousar1.verificaCombustivel();
			e.Decisao(pousar1, decolar1);
			pousar1.passarTempo();
			
			System.out.println("LISTA DE POUSO");
			System.out.println(pousar1.mostrarLista());
			System.out.println("LISTA DE DECOLAR");
			System.out.println(decolar1.mostrarLista());
			System.out.println("--------------------------------");
		}

		
	}

}
