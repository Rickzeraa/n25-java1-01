package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Usando o scanner para ler um arquivo texto
		Scanner sc = new Scanner(Exercicio01.class.getResourceAsStream("arquivo.txt"));
			String linha = sc.nextLine(); //pegando cabeçalho
			Scanner sca = new Scanner(linha);
			sca.useDelimiter(";");
			//Imprimindo o cabeçalho
			while(sca.hasNext()) {
				System.out.print(sca.next()+"\t\t");
			}
			System.out.println();//pulando a linha
			sca.close();//fechando o scanner de apoio
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca = new Scanner(linha);
			sca.useDelimiter(";");
			sysou
		}

	}

}
