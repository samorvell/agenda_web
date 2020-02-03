package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nome completo:");
		//sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Quantos quartos tem em sua casa?");
		int quartos = sc.nextInt();
		System.out.println("Digite o valor do produto:");
		double price = sc.nextDouble();
		System.out.println("Informe seu ultimo nome, idade e altura,(na mesma linha)");
		String lname = sc.next();
		int age = sc.nextInt();
		double altura = sc.nextDouble();
		System.out.println("Nome completo:");
		System.out.println(name);
		System.out.println("Quantidade de quartos:");
		System.out.println(quartos);
		System.out.println("Valor produto:");
		System.out.println(price);
		System.out.println("ultimo nome, idade e altura:");
		System.out.println(lname);
		System.out.println(age);
		System.out.println(altura);
		
		sc.close();
		
	}

}
