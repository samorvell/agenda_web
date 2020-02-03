package udemy;

import java.util.Scanner;

public class Teste_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask  = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ){
			System.out.println("o sexto bit é valido ");
		}
		else{
			System.out.println("o sexto bit não é valido ");
		}
		
		sc.close();

	}

}