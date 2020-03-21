package entidades.exceptions;

public class DataInvalidaException extends Excecoes {
	private static final long serialVersionUID = 1L;

	public DataInvalidaException(String msg) {
		super("Data Invalida! " + msg);
	}

}
