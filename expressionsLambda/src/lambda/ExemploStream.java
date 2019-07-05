package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		/*
		 * Estudo sobre expressões Lambda nessa classe temos 3 exemplos bem simples
		 * usando a classe Stream usando os metodos Filter e map , para fazer operações
		 * de filtro e mapeamento de valores.
		 */

		List<String> languages = Arrays.asList("Java", "C++", "Python", "SQL", "Lisp", "javaScript");

		// filtrar todos os nomes que iniciam com J
		languages.stream().filter(l -> l.toUpperCase().startsWith("J")).forEach(System.out::println);

		// filtrar todos os nomes que possuem mais de 5 caracteres
		languages.stream().filter(l -> l.length() > 5).forEach(System.out::print);

		// Transformar esta lista em uma lista de inteiros contendo o tamanho de cada
		// palavra e imprimir
		List<Integer> collect = languages.stream().map(l -> l.length()).collect(Collectors.toList());
		collect.forEach(System.out::print);
	}

}
