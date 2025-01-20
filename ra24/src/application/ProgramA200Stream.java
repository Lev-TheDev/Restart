package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramA200Stream {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<Integer> st2 = list.stream().map(x -> x * 10);
		// da pra usar filter depois map para aplicar uma operaçao apenas em alguns elementos da list que correspondam ao que você necessita
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<String> st3 = Stream.of("Maria", "Alex", "Tony");
		System.out.println(Arrays.toString(st3.toArray()));
		
		Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st5.limit(10).toArray()));
	}

}
