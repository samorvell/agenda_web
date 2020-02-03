package udemy;

import java.util.Scanner;

public class ExercicioPostoGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
				
		System.out.println("Informe de 1 a 4 para: \n"
				+ "1 para Àcool \n" 
				+ "2 para Gasolina\n"
				+ "3 para Diesel\n" 
				+ "4 para sair");
		int opt = sc.nextInt();
		
		while (opt != 4){
			if (opt == 1){
				alcool = alcool+1;
						
			}
			else if (opt == 2 ){
				gasolina = gasolina + 1;
			}
			else if (opt == 3){
				diesel = diesel + 1;
			}
			else if (opt != 1 || opt != 2 || opt!= 3 || opt != 4)
				System.out.println("Informe uma opção valida entre 1 a 4: ");
			opt = sc.nextInt();
		}
		System.out.println("Muito obrigado! \n Volte sempre!");
		System.out.println("Àlcool   : "+ alcool);
		System.out.println("Gasolina : "+ gasolina);
		System.out.println("Diesel   : "+ diesel);
		
		sc.close();
	}

}
