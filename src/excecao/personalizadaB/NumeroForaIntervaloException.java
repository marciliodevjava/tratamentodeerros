package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {

	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		
		return String.format("O n�mero %s est� fora do intervalo! ", this.nomeDoAtributo);
	}
}
