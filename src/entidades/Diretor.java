package entidades;

public class Diretor extends Funcionario{
	public Double getImpostoRenda () {
		Double porcentagem = 0.23;
		return Salario*porcentagem;
		
	}
}
