package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploMap01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		// multiplicar todos os n�meros em por eles mesmos e criar uma nova lista com o
		// resultado da
		// multiplica��o ao final imprimir usando java 8.

		List<Integer> collect = numbers.stream().map(n -> n * n).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}
