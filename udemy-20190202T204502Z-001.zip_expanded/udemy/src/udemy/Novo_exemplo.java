package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Novo_exemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		//flush limpeza de stream qualquer next line, in
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		double n2 = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		
		
		
		
		
		sc.close();

	}

}
