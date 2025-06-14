package br.com.senaisp.bauru.aula04;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Exemplo: Roberto da Silva Sauro
		//Obert o primeiro nmome e o ultimo nome que foi digitado
		//Tratando para user que não sabe ler
		if (!nome.contains(" ")) nome = nome + " ";
		String priNome = nome.substring(0,nome.indexOf(" "));
		String ultNome = nome.substring(nome.lastIndexOf(" ")+1);
		System.out.println(priNome);
		System.out.println(ultNome);
		sc.close();
	}
}
