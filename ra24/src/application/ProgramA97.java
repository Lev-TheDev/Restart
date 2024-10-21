package application;

// for each
// for (Tipo apelido : coleção) {
//      <comando>
// }

public class ProgramA97 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String element : vect) {
			System.out.println(element);
		}
		
	}
}
