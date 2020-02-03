package udemy;

import java.util.Scanner;

public class ExecicioSegundo_pdf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Inoforme um numero real");
		int N=sc.nextInt();
		if (N % 2 == 0){
			System.out.println("Numero par ");
		}
		else
			System.out.println("numero impar");		
		sc.close();
	}
}
