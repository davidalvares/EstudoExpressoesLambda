package lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploForEach01 {

	public static void main(String[] args) {
		
// Utilizando forEach com objetos.

		List<Pessoa> costBeforeTax = Arrays.asList(new Pessoa("João", 2531.0), new Pessoa("José", 1600.0),
				new Pessoa("Nicolas", 2810.0));

		// for (Pessoa p : costBeforeTax) {
		// double inss = p.salario * 5 / 100;
		// System.out.println(inss);
		// }

		// Reescrever usando Lambda.
		costBeforeTax.forEach(p -> System.out.println(p.salario * 5 / 100));
	}
}
