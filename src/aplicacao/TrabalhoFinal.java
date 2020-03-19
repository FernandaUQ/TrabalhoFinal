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
		
		String Continuar;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> func = new ArrayList<Funcionario>();
		
		
		
		do {
			
			Funcionario funcionario = new Funcionario();
		
			System.out.println("Cadastro de Funcion�rios");
			System.out.println("Matricula: ");
			Long matricula =(sc.nextLong());
			sc.nextLine();
			
			System.out.println("CPF:  ");
			Long cpf = (sc.nextLong());
			sc.nextLine();
			
			System.out.println("Nome:  ");
			String Nome =(sc.nextLine());
			sc.nextLine();
			
			System.out.println("Sal�rio:  ");
			Double Salario = (sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Data de Admiss�o: (dd/mm/aaaa) ");
			Date Data_Admiss�o = (sdf.parse(sc.next()));
			sc.nextLine();
			
			System.out.println("Informe a fun��o: (Professor/Diretor)");
			String funcao = sc.nextLine();
			sc.nextLine();
			
			if (funcao == "Professor") {
				func.add(new Professor(matricula, cpf, Nome, Salario, Data_Admiss�o));
			}else {
				func.add(new Diretor(matricula, cpf, Nome, Salario, Data_Admiss�o));
			}
			
			
			System.out.println("Deseja cadastrar mais funcionarios? (Sim/N�o)");
			Continuar = sc.nextLine();
			sc.nextLine();
		} while (Continuar == "Sim");
		
		for (Funcionario funcionario : func) {
			System.out.println(funcionario.toString());
		}
		
		
		 sc.close();
	}

}
