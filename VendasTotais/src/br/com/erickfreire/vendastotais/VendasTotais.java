package br.com.erickfreire.vendastotais;

import java.util.Scanner;

/**
 * Programa em Java que simula a venda de produtos por uma equipe
 * @author Erick Freire
 * @version 1  - Criado em 10-07-2021 as 17:00
 */

public class VendasTotais {
	public static void main(String[] args) {
		int[][] vendas = new int[30][4];
		int codigo = 0;
		
		double vendedor1 = 0;
		double vendedor2 = 0;
		double vendedor3 = 0;
		double vendedor4 = 0;
		
		double produto0 = 0.00;
		double produto1 = 50.00;
		double produto2 = 100.00;
		double produto3 = 150.00;
		double produto4 = 200.00;
		double produto5 = 250.00;
		
		double total = 1.00;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 30; i++) {
			
			System.out.printf("Vendas do dia %d %n", i + 1);
			
			for(int j = 0; j < 4; j++) {
				System.out.printf("Informe o código de venda, para o funcionario %d : ", j + 1);
				codigo = entrada.nextInt();
				
				if(j == 0) {
					if(codigo == 0) {
						total *= produto0;
						vendedor1 += total;
					}
					if(codigo == 1) {
						total *= produto1;
						vendedor1 += total;
					}
					if(codigo == 2) {
						total *= produto2;
						vendedor1 += total;
					}
					if(codigo == 3) {
						total *= produto3;
						vendedor1 += total;
					}
					if(codigo == 4) {
						total *= produto4;
						vendedor1 += total;
					}
					if(codigo == 5) {
						total *= produto5;
						vendedor1 += total;
					}
				}
				
				if(j == 1) {
					if(codigo == 0) {
						total *= produto0;
						vendedor2 += total;
					}
					if(codigo == 1) {
						total *= produto1;
						vendedor2 += total;
					}
					if(codigo == 2) {
						total *= produto2;
						vendedor2 += total;
					}
					if(codigo == 3) {
						total *= produto3;
						vendedor2 += total;
					}
					if(codigo == 4) {
						total *= produto4;
						vendedor2 += total;
					}
					if(codigo == 5) {
						total *= produto5;
						vendedor2 += total;
					}
				}
				
				if(j == 2) {
					if(codigo == 0) {
						total *= produto0;
						vendedor3 += total;
					}
					if(codigo == 1) {
						total *= produto1;
						vendedor3 += total;
					}
					if(codigo == 2) {
						total *= produto2;
						vendedor3 += total;
					}
					if(codigo == 3) {
						total *= produto3;
						vendedor3 += total;
					}
					if(codigo == 4) {
						total *= produto4;
						vendedor3 += total;
					}
					if(codigo == 5) {
						total *= produto5;
						vendedor3 += total;
					}
				}
				
				if(j == 3) {
					if(codigo == 0) {
						total *= produto0;
						vendedor4 += total;
					}
					if(codigo == 1) {
						total *= produto1;
						vendedor4 += total;
					}
					if(codigo == 2) {
						total *= produto2;
						vendedor4 += total;
					}
					if(codigo == 3) {
						total *= produto3;
						vendedor4 += total;
					}
					if(codigo == 4) {
						total *= produto4;
						vendedor4 += total;
					}
					if(codigo == 5) {
						total *= produto5;
						vendedor4 += total;
					}
				}
				
				total = 1.00;
			}		
			
		}
		
		System.out.println("\n\nO total de vendas foi: ");
		
		System.out.printf("func1\tfunc2\tfunc3\tfunc4%n");
		
		System.out.printf("%.2f\t%.2f\t%.2f\t%.2f%n", vendedor1, vendedor2, vendedor3, vendedor4);
	}

}
