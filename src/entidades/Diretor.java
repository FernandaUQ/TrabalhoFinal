package entidades;

import java.text.SimpleDateFormat;
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
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Dados do Funcionario \nMatricula: " + Matricula + "\nCPF: " + CPF + "\nNome: " + Nome + "\nSalario: " + String.format("%.2f" , Salario)
				+ "\nData da Admissão: " + sdf.format(Data_Admissão) + "\nImposto de Renda: " + String.format("%.2f" ,getImpostoRenda()) + "\n";
	}

	
	
}
