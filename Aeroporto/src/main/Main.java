package main;

import java.util.Random;
import java.util.Scanner;

import bases.Aviao;
import bases.Aviao2;
import bases.Evento;
import bases.Fila;
import bases.Fila2;

public class Main {

	public static void main(String[] args) {
		Evento e = new Evento();
		Fila pousar1 = new Fila();
		Fila pousar2 = new Fila();
		Fila2 decolar1 = new Fila2();
		Fila2 decolar2 = new Fila2();
		Random gerador = new Random();
		Scanner scan = new Scanner(System.in);
		float tempoDec = 0;
		float tempoPou = 0;
		float nDec = 0;
		float nPou = 0;
		
		System.out.println("Digite o numero de interações");
		int n = scan.nextInt();
		
		//Loop Geral
		for (int i = 0; i < n; i++) {
			
			//Gerador de Aviões chegando para pousar
			int qtd = gerador.nextInt(3);
			
			for (int j = 0; j < qtd; j++) {
				int combustivel = gerador.nextInt(7);
				
				Aviao aux = new Aviao(combustivel+2);
				
				if (pousar1.getTamanho() < pousar2.getTamanho()) {
					pousar1.inserirFinal(aux);
				}else {
					pousar2.inserirFinal(aux);
				}
				
			}
			
			//Gerador de Aviões chegando para Decolar
			qtd = gerador.nextInt(3);
			
			for (int j = 0; j < qtd; j++) {
				Aviao2 aux = new Aviao2(0);
				
				if (decolar1.getTamanho() < decolar2.getTamanho()) {
					decolar1.inserirFinal(aux);
				}else {
					decolar2.inserirFinal(aux);
				}
				
			}
			
			System.out.println("LISTA DE POUSO 1 ");
			System.out.println(pousar1.mostrarLista());
			System.out.println("LISTA DE DECOLAR 1 ");
			System.out.println(decolar1.mostrarLista());
			System.out.println("LISTA DE POUSO 2 ");
			System.out.println(pousar2.mostrarLista());
			System.out.println("LISTA DE DECOLAR 2 ");
			System.out.println(decolar2.mostrarLista());

			
			if (nPou > 0) {
				System.out.println("Tempo pouso medio "+tempoPou/nPou);
			}
			if (nDec > 0) {
				System.out.println("Tempo decolagem medio "+(tempoDec/nDec));
			}
			
			System.out.println("--------------------------------");
			
			pousar1.verificaCombustivel();
			pousar2.verificaCombustivel();
			Aviao a = e.Decisao(pousar1, decolar1);
			Aviao b = e.Decisao(pousar2, decolar2);
			decolar1.passarTempo();
			decolar2.passarTempo();
			pousar1.passarTempo();
			pousar2.passarTempo();
			
			if (a.getId() % 2 == 0) {
				nPou++;
				tempoPou += a.getTempo();
			}else if (a.getId() % 2 != 0) {
				nDec++;
				tempoDec += b.getTempo();
			}
			
			if (b.getId() % 2 == 0) {
				nPou++;
				tempoPou += a.getTempo();
			}else if (b.getId() % 2 != 0) {
				nDec++;
				tempoDec += b.getTempo();
			}
		}
		
		scan.close();

	}

}
