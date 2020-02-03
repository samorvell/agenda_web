package udemy;

import java.util.Scanner;

public class TempoDeDuracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int DUR;
		
		System.out.println("informe hora incio ");
		int HOI=sc.nextInt();
		
		System.out.println("informe hora termino");
		int HOT=sc.nextInt();
		DUR=HOT - HOI;
		if (DUR == 0){
			System.out.println("Duracao = 24 horas");
		}
		else		
		System.out.println("Duracao = " + DUR + " horas");		
		
		sc.close();

	}

}
