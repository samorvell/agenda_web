package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_pdf {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe primeiro valor inteiro: ");
		int v1 = sc.nextInt();
		System.out.println("Informe segundo valor inteiro: ");
		int v2 = sc.nextInt();
		
		int soma = v1 + v2;
		System.out.println("Valor da soma dos dois numeros é: ");
		System.out.println(soma);
		
		sc.close();
		

	}

}
