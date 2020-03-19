package entidades;

import java.util.Date;

public class Diretor extends Funcionario{

	

	public Diretor() {
		super();
	}

	public Diretor(long matricula, Long cpf, String nome, Double salario, Date data_Admissão) {
		super(matricula, cpf, nome, salario, data_Admissão);

	}
	
	

	@Override
	public Double getImpostoRenda() {
		double porcentagem = 0.23;
		return Salario*porcentagem;
	}

	@Override
	public String toString() {
		return "Dados do Funcionario \nMatricula: " + Matricula + "\nCPF: " + CPF + "\nNome: " + Nome + "\nSalario: " + Salario
				+ "\nData da Admissão: " + Data_Admissão + "\nImposto de Renda: " + getImpostoRenda() + "\n";
	}

	
	
}
