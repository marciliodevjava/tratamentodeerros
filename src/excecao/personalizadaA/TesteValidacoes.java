package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) throws IllegalAccessException {

		try {
			Validar.aluno(null);
		} catch (IllegalAccessException e) {
		}
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
		} catch (StringVaziaExcepetion e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");

	}
}
