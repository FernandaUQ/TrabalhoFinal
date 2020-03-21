package entidades.exceptions;

public class Excecoes extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public Excecoes (String msg) {
		super(msg);
	}
	
	public String getMessage () {
		return msg;
	}
	
	
	
}
