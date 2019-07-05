package lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploForEach {

	public static void main(String[] args) {

		// Exemplo de conversão de for tradicional para o forEach do java 8.

		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

		// for (Integer cost : costBeforeTax) {
		// double price = cost + .12 * cost;
		// System.out.println(price);
		// }

		// Reescrever usando lambdas.
		costBeforeTax.forEach(cost -> System.out.print(cost + .12 * cost));
	}

}
