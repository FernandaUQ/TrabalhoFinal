package entidades;

import java.util.Date;

public class Professor extends Funcionario {
	
	public Professor () {	
		super();
	}
	
	
	public Professor(long matricula, Long cpf, String nome, Double salario, Date data_Admiss�o) {
		super(matricula, cpf, nome, salario, data_Admiss�o);
	}


	@Override
	public Double getImpostoRenda() {
		double porcentagem = 0.20;
		return Salario*porcentagem;
	}


	@Override
	public String toString() {
		return "Dados do Funcionario \nMatricula: " + Matricula + "\nCPF: " + CPF + "\nNome: " + Nome + "\nSalario: " + Salario
				+ "\nData da Admiss�o: " + Data_Admiss�o + "\nImposto de Renda: " + getImpostoRenda() + "\n";
	}

	
	
}
