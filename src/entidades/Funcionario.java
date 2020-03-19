package entidades;

import java.util.Date;

public class Funcionario {
	
	protected long Matricula;
	protected Long CPF;
	protected String Nome;
	protected Double Salario;
	protected Date Data_Admiss�o;
	
	public Funcionario () {
		
	}

	public Funcionario(long matricula, Long cpf, String nome, Double salario, Date data_Admiss�o) {
		Matricula = matricula;
		CPF = cpf;
		Nome = nome;
		Salario = salario;
		Data_Admiss�o = data_Admiss�o;
	}

	public long getMatricula() {
		return Matricula;
	}

	public void setMatricula(long matricula) {
		Matricula = matricula;
	}

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(Long cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public Date getData_Admiss�o() {
		return Data_Admiss�o;
	}

	public void setData_Admiss�o(Date data_Admiss�o) {
		Data_Admiss�o = data_Admiss�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + (int) (Matricula ^ (Matricula >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (Matricula != other.Matricula)
			return false;
		return true;
	}

	public Double getImpostoRenda () {
		Double porcentagem = null;
		return Salario*porcentagem;
		
	}

	@Override
	public String toString() {
		return "Dados do Funcionario \nMatricula: " + Matricula + "\nCPF: " + CPF + "\nNome: " + Nome + "\nSalario: " + Salario
				+ "\nData da Admiss�o: " + Data_Admiss�o + "\nImposto de Renda: " + getImpostoRenda() + "\n";
	}
	
	
	
	
	
	
}
