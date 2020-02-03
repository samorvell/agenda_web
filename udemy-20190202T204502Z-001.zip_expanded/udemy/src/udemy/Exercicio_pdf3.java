package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_pdf3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int DIF = (A * B) - (C * D);
		//System.out.println(DIF);
		System.out.println("DIFERENCA = " + DIF);
		 sc.close();
		//System.out.println(A B C D);
	}

}
