package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Digite um número para ser divisivel por 7:".trim());
			System.out.println(7 / entrada.nextInt());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...#01");
			System.out.println("Fim");
			entrada.close();
		}

	}
}
