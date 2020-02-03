package udemy;

public class ReferenciasFuncoes {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG bc ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");

		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-"); // todas as letras em
															// caixa baixa

		System.out.println("toUpperCase: -" + s02 + "-"); // todas as letras em
															// caixa alta

		System.out.println("trim: -" + s03 + "-"); // tirar os espasços
													// sobresalentes

		System.out.println("substring(2): -" + s04 + "-"); // retirar parte das
															// letras

		System.out.println("substring(2, 9): -" + s05 + "-"); // retirar parte
																// das letras de
																// um inicio a
																// um fim

		System.out.println("replace('a', 'x'): -" + s06 + "-"); // trocar letras
																// por outras

		System.out.println("replace('abc', 'xy'): -" + s07 + "-");

		System.out.println("Index of 'bc': " + i); // indica em que lugar ocorre
													// essa insidencia
													// verificando da esquerda
													// para direita

		System.out.println("Last index of 'bc': " + j); // mesma coisa que a de
														// cima porem da direita
														// para esquerda

		String s = "eu quero carona";
		String[] vect = s.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
