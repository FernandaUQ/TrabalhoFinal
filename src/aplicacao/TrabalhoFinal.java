package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import entidades.Diretor;
import entidades.Funcionario;
import entidades.Professor;
import entidades.exceptions.DataInvalidaException;
import entidades.exceptions.ObjetoCadastradoException;

public class TrabalhoFinal {

	public static void main(String[] args) throws ParseException {
		
		Long matricula=null;
		Double totalImposto = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> func = new ArrayList<Funcionario>();
		
		Integer Continuar = 1;
		
		Funcionario funcionario = new Funcionario();
		
		
			do {
				try {
					
			
				System.out.println("Cadastro de Funcion�rios");
				System.out.println("Matricula: ");
				matricula =(sc.nextLong());
				sc.nextLine();
				
				
				for (Funcionario f : func) {
				if (matricula.equals(f.getMatricula())) {
					throw new ObjetoCadastradoException("Erro! Objeto J� Cadastrado! ");
					
				}
				}
				
				
				System.out.println("CPF:  ");
				Long cpf = (sc.nextLong());
				sc.nextLine();
				
				System.out.println("Nome:  ");
				String Nome =(sc.next());
				sc.nextLine();
				
				System.out.println("Sal�rio:  ");
				Double Salario = (sc.nextDouble());
				sc.nextLine();
				
				System.out.println("Data de Admiss�o: (dd/mm/aaaa) ");
				Date Data_Admiss�o = (sdf.parse(sc.next()));
				sc.nextLine();
				
				Date dataAtual;
				String hoje = sdf.format(dataAtual = new Date());
				if (Data_Admiss�o.compareTo(sdf.parse(hoje)) > 0 )  {
					throw new DataInvalidaException("Data informada al�m da atual! ");
				}
				
				
				System.out.println("Informe a fun��o: (1-Professor/2-Diretor)");
				int funcao = sc.nextInt();
				sc.nextLine();
				
				if (funcao == 1) {
					func.add(new Professor(matricula, cpf, Nome, Salario, Data_Admiss�o));
				}else if(funcao ==2) {
					func.add(new Diretor(matricula, cpf, Nome, Salario, Data_Admiss�o));
				} else {
					throw new InputMismatchException();
				}
				
				
				
				System.out.println("Deseja cadastrar mais funcionarios? (1-Sim/2-N�o)");
				Continuar = sc.nextInt();
				sc.nextLine();
				
				if (Continuar != 1 && Continuar !=2) {
					throw new InputMismatchException();
				}
				
				}catch (InputMismatchException e) {
					System.out.println("Erro! Dado Invalido! ");
					continue;
				}catch (ObjetoCadastradoException e) {
					System.out.println("Objeto Cadastrado Anteriormente! ");
					continue;
				}catch (DataInvalidaException e) {
					System.out.println("Data Invalida! Superior a atual! ");
					continue;
				}catch (ParseException e) {
					System.out.println("Valor Invalido! " );
					continue;
				}
				
			} while (Continuar != 2);
		
		
		
		
		for (Funcionario f : func) {
			System.out.println(f.toString());
			totalImposto =+ f.getImpostoRenda();
		}
		
		System.out.println("M�dia do Imposto de Renda: " + String.format("%.2f",totalImposto/func.size()));
		System.out.println("Valor total em Imposto de Renda: " + String.format("%.2f", totalImposto));
		
		 sc.close();
	}

}