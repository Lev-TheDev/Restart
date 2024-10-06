package application;

public class ProgramA59 {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); //elimina espaços em branco ao final
		String s04 = original.substring(2, 9);
		String s05 = original.replace('a', 'x');
		String s06 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");


		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2, 9): -" + s04 + "-");
		System.out.println("replace('a', 'x'): -" + s05 + "-");
		System.out.println("replace('abc', 'xy'): -" + s06 + "-");
		System.out.println("indexOf 'bc': -" + i + "-");
		System.out.println("lastIndexOf 'bc': -" + j + "-");
		
		System.out.println("------------------------------------------");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		for (int k = 0; k < vect.length; k++) {
			System.out.println(vect[k]);
		}

	}

}
