package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeErrorException e) {
			System.out.println(e.getMessage());
		}
		
		geraErro2();

		System.out.println("Fim");

	}

	// Exceção não verificada
	static void geraErro1() {
		throw new RuntimeErrorException(null, "Ocorreu um erro bem legal #1");
	}

	static void geraErro2() {
		new Exception("Ocorreu um erro bem legal #2");
	}
}
