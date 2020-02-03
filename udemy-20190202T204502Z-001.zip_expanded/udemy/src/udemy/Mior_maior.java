package udemy;

import java.util.Scanner;

public class Mior_maior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("por favor informe 3 numeros separados por espa�os" );
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int N3=sc.nextInt();
		
		if (N1 > N2 && N1 > N3 ){
			System.out.println("Maior " + N1);
		}
		else if (N2 > N3 ){
				System.out.println("Maior "+ N2);
		}
		else
			System.out.println("Maior " + N3);
		sc.close();
	}		
}
