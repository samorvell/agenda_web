package udemy;

import java.util.Scanner;

public class ValidarMaiorQue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int numero = 0;

		System.out.println("informe um numero positivo valido: ");
		numero = sc.nextInt();

		while (numero <= 0) {
			System.out.println("Numero invalido, informe novamente um numero positivo valido. ");
			numero = sc.nextInt();

		}
		for (int i = 1; i <= numero; i++) {
			System.out.println("informe o " + i + "°" + " numero");
			int N = sc.nextInt();
			if (N >= max) {
				max = N;
			}
			
		}
		System.out.println("Maior valor é: " + max);
		sc.close();
	}
}
