package competec.aula3_arranjos;

import java.util.Scanner;

public class Desafio3EntradaSaidaArranjos {

	public static void main(String[] args) {

		// Coletar tamanho arranjo

		// Preencher arranjo

		// Impremir arranjo

		/*
		 * Desafio extra:
		 * Crie outro arranjo e inverta a ordem dos valores do primeiro arranjo.
		 */

		 	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de arranjos");
		int num = scanner.nextInt();

        int valor [] = new int [num];

        for(int i = 1;i<=valor.length;i++) {
            System.out.println(i);
        }
	}
}