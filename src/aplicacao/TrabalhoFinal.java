package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Diretor;
import entidades.Funcionario;
import entidades.Professor;

public class TrabalhoFinal {

	public static void main(String[] args) throws ParseException {
		
		
		Double totalImposto = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> func = new ArrayList<Funcionario>();
		
		
		
		int Continuar;
		
		do {
			
			Funcionario funcionario = new Funcionario();
		
			System.out.println("Cadastro de Funcionários");
			System.out.println("Matricula: ");
			Long matricula =(sc.nextLong());
			sc.nextLine();
			
			System.out.println("CPF:  ");
			Long cpf = (sc.nextLong());
			sc.nextLine();
			
			System.out.println("Nome:  ");
			String Nome =(sc.next());
			sc.nextLine();
			
			System.out.println("Salário:  ");
			Double Salario = (sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Data de Admissão: (dd/mm/aaaa) ");
			Date Data_Admissão = (sdf.parse(sc.next()));
			sc.nextLine();
			
			System.out.println("Informe a função: (1-Professor/2-Diretor)");
			int funcao = sc.nextInt();
			sc.nextLine();
			
			if (funcao == 1) {
				func.add(new Professor(matricula, cpf, Nome, Salario, Data_Admissão));
			}if(funcao ==2) {
				func.add(new Diretor(matricula, cpf, Nome, Salario, Data_Admissão));
			}
			
			System.out.println("Deseja cadastrar mais funcionarios? (1-Sim/2-Não)");
			Continuar = sc.nextInt();
			sc.nextLine();
		} while (Continuar != 2);
		
		for (Funcionario funcionario : func) {
			System.out.println(funcionario.toString());
			totalImposto =+ funcionario.getImpostoRenda();
		}
		
		System.out.println("Média do Imposto de Renda: " + String.format("%.2f",totalImposto/func.size()));
		System.out.println("Valor total em Imposto de Renda: " + String.format("%.2f", totalImposto));
		
		 sc.close();
	}

}
