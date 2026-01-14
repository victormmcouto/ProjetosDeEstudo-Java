package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add("Marco");
		
		List<String> nomesComA = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String name : lista) {
			System.out.println(name);
		}
		
		System.out.println();
		
		for (String name : nomesComA) {
			System.out.println(name);
		}
	}
}
