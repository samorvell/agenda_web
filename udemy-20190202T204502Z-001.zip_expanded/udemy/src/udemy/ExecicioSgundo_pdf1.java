package udemy;

import java.util.Scanner;

public class ExecicioSgundo_pdf1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero ");
		int N1=sc.nextInt();
		
		if (N1 < 0 ){
			System.out.println("Sainda: Negativo" );
		}
		else 
			System.out.println("Saida: Positivo");
		
	sc.close();	

	}

}
