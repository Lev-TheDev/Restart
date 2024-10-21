package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramA99 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Ana");
		
		lista.add(2, "Marcos");
		System.out.println(lista.size());
		lista.remove("Ana");
		lista.remove(3);
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for (String e : lista) {
			System.out.println(e);
		}
		
		System.out.println("Index of Alex: " + lista.indexOf("Alex"));
		System.out.println("Index of Penny: " + lista.indexOf("Penny"));
		// quando não encontra ou não tem elemento, retorna -1
		
		System.out.println("---------------------------");
		
		lista.add("Maria");
		lista.add("Bob");
		lista.add("Ana");
		lista.add("Marcos");
		
		for (String e : lista) {
			System.out.println(e);
		}
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// converte para stream, filtra pelo predicado, converte novamente para list
		System.out.println("---------------------------");
		for (String e : result) {
			System.out.println(e);
		}
		System.out.println("---------------------------");

		String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
