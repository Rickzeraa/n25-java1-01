package br.com.senaisp.bauru.aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		int vlr01 = 10;
		int vlr02 = vlr01;
		System.out.println("vlr02: " + vlr01);
		System.out.println("vlr02: " + vlr02);
		//String
		        String str01 = "Abelha";
				String str02 = "Abelha";
				System.out.println("str01" + str01);
		        System.out.println("str01" + str02);
		        System.out.println(str01==str02);
		        System.out.println(str01.equals(str02));
		        //Nessa comparação, é feita de enderço de memória
		        //não conteúdo
		        System.out.println(str01==str02);
		        //Para comparar conteudo usamos equals ou compare
		        System.out.println(str01.equals(str02));

	}

}
