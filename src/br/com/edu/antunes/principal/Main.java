package br.com.edu.antunes.principal;

import java.util.Scanner;

import br.com.edu.antunes.classes.Busca;

public class Main {

	public static void main(String[] args) {
		
		  Scanner ent = new Scanner(System.in);
		  
		  System.out.print("Informe a quantidade de números: ");
		  int num = ent.nextInt();
		  System.out.println();
		  
//		  int vetor[] = {5, 10, 17, 3, 40}; 
		  double vetorNum[] = new double[num];
		  
		  Busca busca = new Busca(); 
		  busca.insere(vetorNum);
		  
		  System.out.println(busca.realizarBusca(vetorNum));
		 
		  ent.close();
	}
}

