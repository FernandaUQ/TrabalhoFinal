package entidades.exceptions;

public class ObjetoCadastradoException extends Excecoes{
	private static final long serialVersionUID = 1L;

	public ObjetoCadastradoException(String msg) {
		super("O Funcionario Informado Ja Está Cadastrado! "+ msg);
	}

}
