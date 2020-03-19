package entidades;

public class Professor extends Funcionario {
	
	public Double getImpostoRenda () {
		Double porcentagem = 0.20;
		return Salario*porcentagem;
		
	}
}
