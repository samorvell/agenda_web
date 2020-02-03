package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_pdf4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int NMF, NHT;
		double VPH;
		double SALARY;
		
		NMF = sc.nextInt();
		NHT = sc.nextInt();
		VPH = sc.nextDouble();
		SALARY = NHT * VPH;
		System.out.println("NUMBER = " + NMF) ;
		System.out.println("Salario = R$ " + SALARY);
		System.out.print("SALARY = U$" + SALARY);
		
		sc.close();
		
		

	}

}
