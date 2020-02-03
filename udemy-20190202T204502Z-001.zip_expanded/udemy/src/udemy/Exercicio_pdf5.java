package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_pdf5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//variaveis
		int codigo1, quantidade1, codigo2, quantidade2; 
		double valorunitario1, valorunitario2;
		
		//informações de entrada
		System.out.println("codigo1");
		codigo1 = sc.nextInt();
		System.out.println("quantidade1");
		quantidade1 = sc.nextInt();
		System.out.println("Valor1");
		valorunitario1 = sc.nextDouble();
		System.out.println("codigo2");
		codigo2 = sc.nextInt();
		System.out.println("quantidade2");
		quantidade2 = sc.nextInt();
		System.out.println("Valor2");
		valorunitario2 = sc.nextDouble();
		
		//calculos
		double VT1 =  quantidade1 * valorunitario1;
		double VT2 =  quantidade2 * valorunitario2;	
		double VT = VT1 + VT2;
		
		System.out.println("Codigo 1° produto: "+ codigo1 );
		System.out.println("Codigo 2° produto: "+ codigo2 );
		System.out.printf("Valor a pagar  : R$ %.2f%n", VT);
		
		sc.close();
		

	}

}
