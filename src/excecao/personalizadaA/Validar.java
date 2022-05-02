package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	private Validar() {
	}

	public static void aluno(Aluno aluno) throws IllegalAccessException {
		if(aluno == null) {
			throw new IllegalAccessException("O aluno está nulo");
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExcepetion("nome");
		}
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
