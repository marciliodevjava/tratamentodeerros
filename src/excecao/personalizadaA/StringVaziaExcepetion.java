package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExcepetion extends RuntimeException {

	private String nomeDoAtributo;

	public StringVaziaExcepetion(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		
		return String.format("O atributo %s est� v�zio!", this.nomeDoAtributo);
	}
}
