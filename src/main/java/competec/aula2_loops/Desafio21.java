package competec.aula2_loops;

import java.util.Scanner;

public class Desafio21 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x;

		System.out.println("digite o valor inteiro:");
		x = scanner.nextInt();

		for(i=x; i <= 10; i++){
			System.out.println(x * i);
		}


	}
}
