package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) throws Exception {

		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		geraErro2();

		System.out.println("Fim");
	}

	// Exceção não verificada
	static void geraErro1() {
		throw new RuntimeErrorException(null, "Ocorreu um erro bem legal #1");
	}

	// Exceção verificada, tem que colocar na assinatura o "throws Excepetion"
	static void geraErro2() throws Exception {
		try {
			throw new Exception("Ocorreu um erro bem legal #2");
		} catch (Exception e) {
			System.out.println("Que legal. Ocorreu um erro bem legal #2");
		}
	}
}
