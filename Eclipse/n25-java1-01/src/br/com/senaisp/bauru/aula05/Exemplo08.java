package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			//Ultizando uma estrutura while
			String res;
			do {
				System.out.println("Digite S ou N: ");
				res = sc.nextLine();
			}while (!res.equals("s") && !res.equals("N"));
			System.out.println("Saiu!");
			sc.close();
		}

	}


