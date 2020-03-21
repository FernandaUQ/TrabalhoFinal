package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Diretor extends Funcionario{

	

	public Diretor() {
		super();
	}

	public Diretor(Long matricula, Long cpf, String nome, Double salario, Date data_Admissão) {
		super(matricula, cpf, nome, salario, data_Admissão);

	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	

	@Override
	public Double getImpostoRenda() {
		double porcentagem = 0.23;
		return Salario*porcentagem;
	}


	@Override
	public String toString() {
		return super.toString();
	}
	
	

	
	
}
