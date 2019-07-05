package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ExemploIntSummaryStatistics {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		// Usando java 8 retire estatisticas da lista como maximo, minimo, soma e média
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println(stats.getMax());// maior elemento da lista
		System.out.println(stats.getMin()); // menor elemento da lista
		System.out.println(stats.getSum()); // somar todos os elementos da lista
		System.out.println(stats.getAverage()); // mostrar a media dos elementos da lista
		System.out.println(stats.getCount());// conta a quantidade de elementos da lista.
	}

}