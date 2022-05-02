package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaExcepetion extends Exception {

	private String nomeDoAtributo;

	public StringVaziaExcepetion(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		
		return String.format("O atributo %s está vázio!", this.nomeDoAtributo);
	}
}
