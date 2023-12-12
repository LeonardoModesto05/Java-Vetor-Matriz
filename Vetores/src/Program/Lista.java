package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		//cria a lista
		List <Integer> list = new ArrayList<>();
		
		//adiciona valores a lista
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(2,20);
		//imprime o tamanho da lista
		System.out.println(list.size());
		//remove o item da lista indicado no parenteses 
		list.remove(6);
		for (int x : list)
		{
			System.out.println(x);
		}
		System.out.println("----------------------------------------------");
		
		//remove o item da lista que for indicado na condicao
		list.removeIf(x -> x.intValue() == 12);
		
		for (int x : list)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------");
		//imprime a posição do dado na lista
		System.out.println("Index of Bob: " + list.indexOf(20));
		
		List <String> lista = new ArrayList<>();
		lista.add("Jose");
		lista.add("Ana Julia");
		lista.add("Arnaldo");
		lista.add("Ana Paula");
		lista.add("Andre");
		lista.add("Leonardo");
		
		//imprime apenas na lista o valor apresentado na stream
		List <String> result = lista.stream().filter(x -> x.charAt(0)  == 'A').collect(Collectors.toList());
		for (String x : result)
		{
			System.out.println(x);
		}
		//imprime o primeiro nome começado pela string representada
		String name = lista.stream().filter(x -> x.charAt(0)  == 'I').findFirst().orElse(null);
		System.out.println(name);
	}

}
