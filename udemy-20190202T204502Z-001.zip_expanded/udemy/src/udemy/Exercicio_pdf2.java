package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_pdf2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.print("A=");
	    System.out.println(A);
		sc.close();
				
	}
}
