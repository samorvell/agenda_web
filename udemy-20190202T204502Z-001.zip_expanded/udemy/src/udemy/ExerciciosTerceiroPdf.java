package udemy;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosTerceiroPdf {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002){
						
			System.out.println("Acesso negado tente novamente : ");
			
			System.out.println("Informe a senha novamente: ");
			 senha = sc.nextInt();
			
		}
		System.out.println("Acesso concedido! ");
		
		sc.close();
		

	}

}
