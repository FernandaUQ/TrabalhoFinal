package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor extends Funcionario {
	
	public Professor () {	
		super();
	}
	
	
	public Professor(long matricula, Long cpf, String nome, Double salario, Date data_Admissão) {
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
		double porcentagem = 0.20;
		return Salario*porcentagem;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	

	
	
}
