package udemy;

import java.util.Scanner;

public class HoraDoDia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são agora? ");
		int time=sc.nextInt();
		
		if (time < 12){
			System.out.println("bom dia! Luz do dia! ");
		}
		else if (time < 18){
			System.out.println("boa tarde! Lindesa");
		}
		else
			System.out.println("Boa noite! princesa! ");
		sc.close();
	}

}
