package br.com.edu.antunes.classes;

import java.util.Scanner;

public class Busca {
	Scanner ent = new Scanner(System.in);
	
	public void insere(double vetor[]) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Informe um número: ");
			vetor[i] = ent.nextDouble();
			System.out.println();
		}
	}
	
	public int realizarBusca(double vetor[]) {
		System.out.print("Informe um número para realizar a pesquisa: ");
		double num = ent.nextDouble();
		System.out.println();
		int cont = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == num) {
				cont++;
			}
		}
		System.out.print("Quantidade de vezes que o número pesquisado aparece: ");
		return cont;
	}
}

