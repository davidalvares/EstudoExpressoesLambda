package lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploForEach02 {

	public static void main(String[] args) {

		List<Usuario> usuarios = Arrays.asList(new Usuario("David", false), new Usuario("Alvares", true),
				new Usuario("Erika", true), new Usuario("Davi", true));

		// Criar uma nova lista de usuários ativos e imprimir usando java 8 e forEach
		usuarios.stream().filter(usuario -> usuario.ativo).forEach(u -> System.out.println(u.usuario));

	}

}
