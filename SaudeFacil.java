package saudefacil;

import java.util.Scanner;


public class SaudeFacil {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
				
		try {
			int opcao = 99;
			
			while(opcao > 0) {
				System.out.println("########################################################");
				System.out.println("######                 SA�DE F�CIL                ######");
				System.out.println("# Digite 0 (zero) para sair.");
				System.out.println("# Digite a op��o desejada:\n");
				System.out.println("# 1. Acessar a conta: \n");
				System.out.println("# 2. Cadastrar Usu�rio: \n");
				System.out.println("# 3. Cadastrar Familiar: \n");
				System.out.println("# 4. Cadastrar M�dico: \n");
				System.out.println("# 5. Adicionar Cl�nica: \n");
				System.out.println("# 6. Adicionar Consulta: \n");
				System.out.println("# 7. Adicionar Receita: \n");
				System.out.println("# 8. Adicionar Medicamento: \n");
				System.out.println("# 9. Adicionar Exame: \n");
				System.out.println("# 10. Adicionar Vacina: \n");
				System.out.println("# 11. Adicionar Atestado: \n");
				System.out.println("# 12. Adicionar Dose: \n");
				
				
				System.out.println("########################################################");
				
				opcao = scanner.nextInt();
				
				System.out.println();
				
				switch(opcao) {
					case 0:
						System.out.println("Muito obrigado pela visita. Volte sempre!");
						break;
					case 1:
						acessarConta();
						break;
					case 2:
						cadastrarUsuario();
						break;
					case 3:
						cadastrarFamiliar();
						break;
					case 4:
						cadastrarMedico();
						break;
					case 5:
						adicionarClinica();
						break;
					case 6:
						adicionarConsulta();
						break;
					case 7:
						adicionarReceita();
						break;
					case 8:
						adicionarMedicamento();
						break;
					case 9:
						adicionarExame();
						break;
					case 10:
						adicionarVacina();
						break;
					case 11:
						adicionarAtestado();
						break;
					case 12:
						adicionarDose();
						break;
					default:
						break;
				}
				
				System.out.println();
			}
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
	}
	
	private static void acessarConta() {
		Conta conta = criarConta();
	      
		conta.acesso();
	}
	
	private static Conta criarConta() {
		System.out.println("Abertura de conta: Digite o email de login");
	      String login = scanner.next();
	    
	    System.out.println("Digite a senha");
	      String senha = scanner.next();
	      
	      Conta conta = new Conta (login, senha);
	      
	      return conta;
	}
	
	public static void cadastrarUsuario() {
		System.out.println("Digite o nome do Usu�rio");
	      String nome = scanner.next();
	  	System.out.println("Digite o endere�o");
	      String endereco = scanner.next();  
		System.out.println("Digite o email de login");
	      String email = scanner.next();
	  	System.out.println("Digite o telefone de contato:");
	  	  Long telefone = scanner.nextLong();
	  	System.out.println("Digite o CPF do usu�rio:");
	  	  Long cpf = scanner.nextLong();
		
	      Conta usuario = criarConta();
	      
	 Usuario Cadastro = new Usuario (nome, endereco, email, telefone, usuario, cpf);
	      
	}
	
	public static void cadastrarFamiliar() {
		System.out.println("Digite o nome do Usu�rio");
	      String nome = scanner.next();
	  	System.out.println("Digite o endere�o");
	      String endereco = scanner.next();  
		System.out.println("Digite o email para registro");
	      String email = scanner.next();
	  	System.out.println("Digite o telefone de contato:");
	  	  Long telefone = scanner.nextLong();
	  	System.out.println("Qual � o n�vel familia?");
	  	  String nivel = scanner.next();
		
	 	 Familiar Cadastro = new Familiar (nome, endereco, email, telefone, nivel);
	      
	}
	
	public static void cadastrarMedico() {
		System.out.println("Digite o nome do M�dico: ");
	      String nome = scanner.next();
	  	System.out.println("Digite o endere�o do consult�rio");
	      String endereco = scanner.next();  
		System.out.println("Digite o email do M�dico");
	      String email = scanner.next();
	  	System.out.println("Digite o telefone de contato do M�dico:");
	  	  Long telefone = scanner.nextLong();
	  	System.out.println("Especialidade m�dica: ");
	  	  String especialidade = scanner.next();
	  	System.out.println("Digite o CRM do M�dico:");
	  	  int crm = scanner.nextInt();
		
	 	 Medico Cadastro = new Medico (nome, endereco, email, telefone, especialidade, crm);
	}
	
	public static void adicionarClinica() {
		System.out.println("Digite o nome da Cl�nica: ");
	      String nome = scanner.next();
	  	System.out.println("Digite o endere�o da Cl�nica");
	      String endereco = scanner.next();  
		System.out.println("Digite o email de contato da Cl�nica");
	      String email = scanner.next();
	  	System.out.println("Digite o telefone da Cl�nica:");
	  	  Long telefone = scanner.nextLong();
	  	System.out.println("Digite a sua avalia��o sobre a Cl�nica:");
	  	  String avaliacao = scanner.next();
	  		
	 	Clinica Cadastro = new Clinica (nome, endereco, email, avaliacao, telefone);
	}
	
	public static void adicionarConsulta() {
		System.out.println("Digite o Codigo da Consulta:");
	  	  Long codigoconsulta = scanner.nextLong();
	  	System.out.println("Digite data da Consulta:");
	  	  int  dataconsulta = scanner.nextInt();
	  	System.out.println("Digite o hor�rio da consulta:");
	  	  int horario = scanner.nextInt();
		System.out.println("Digite o nome do M�dico: ");
	      String medico = scanner.next();
	   	System.out.println("Especialidade m�dica: ");
		  String especialidade = scanner.next();
	  	System.out.println("Digite o nome do paciente que ir� a consulta:");
	  	 String paciente = scanner.next();
	  	System.out.println("A consulta j� aconteceu?");
	  	  boolean status = scanner.nextBoolean();
		
	 	 Consulta Adicionar = new Consulta (codigoconsulta, dataconsulta, horario, medico, especialidade, paciente, status);
	}
	//Receita - edited by Felipe and Amailson
	public static void adicionarReceita() {
		System.out.println("Digite o nome do M�dico:");
	  	  String nomeMedico = scanner.next();
	  	System.out.println("Digite o nome do Paciente:");
	  	  String  nomepaciente = scanner.next();
	  	System.out.println("Digite o nome do Rem�dio:");
	  	  String nomeRemedio = scanner.next();
	   	System.out.println("Dosagem:");
		  Float dosagem = scanner.nextFloat();
		  
		  Medico medico = new Medico(nomeMedico);
		  Dose dose = new Dose(dosagem);
		  Medicamento medicamento = new Medicamento(nomeRemedio);
		
	 	 Receita Adicionar = new Receita (nomepaciente, medico, medicamento, dose);
	}
	//Medicamento - edited by Felipe and Amailson
	public static void adicionarMedicamento() {
	  	System.out.println("Digite o nome do Paciente:");
	  	  String nomepaciente = scanner.next();
	  	System.out.println("Digite o nome do Rem�dio:");
	  	  String nomeremedio = scanner.next();
		System.out.println("Digite o nome do M�dico:");
		  String nomeMedico = scanner.next();
		System.out.println("Digite o horario para tomar o medicamento: ");
		  String horarioremedio = scanner.next();
		System.out.println("Digite o per�odo:");
		  String periodo = scanner.next();
		System.out.println("Digite o pre�o do rem�dio:");
		  Float preco = scanner.nextFloat();
		  
		  Medico medico = new Medico(nomeMedico);
				  
	 	 Medicamento Adicionar = new Medicamento (nomepaciente, nomeremedio, medico, horarioremedio, periodo, preco);
	}
	//Exame - edited by Felipe and Amailson
	public static void adicionarExame() {
	  	System.out.println("Digite o tipo do Exame:");
	  	  String tipo = scanner.next();
		System.out.println("Digite o nome do Paciente:");
		  String nomepaciente = scanner.next();
	  	System.out.println("Digite a data exame:");
	  	  String dataexame = scanner.next();
	  	System.out.println("Digite a data do resultado do exame:");
	  	  String dataresultado = scanner.next();
		System.out.println("Digite o pre�o do rem�dio:");
		  Float preco = scanner.nextFloat();
		System.out.println("Digite o nome da Cl�nica:");
		  String nomeClinica = scanner.next();
		System.out.println("Digite o endere�o da Cl�nica:");
	      String enderecoclinica = scanner.next(); 
		System.out.println("Digite o status do exame:");
		 boolean status = scanner.nextBoolean();
		 
		 Clinica nomeclinica = new Clinica (nomeClinica);
		 Clinica endereco = new Clinica (enderecoclinica);
				 
		  
	 	 Exame Adicionar = new Exame (nomepaciente, tipo, dataexame, dataresultado, preco, nomeclinica, enderecoclinica, status);
	}
	//Vacina - edited by Felipe and Amailson
	public static void adicionarVacina() {
	  	System.out.println("Digite o nome da Vacina:");
	  	  String nomevacina = scanner.next();
		System.out.println("Digite o objetivo da Vacina:");
		  String objetivo = scanner.next();
		System.out.println("Digite o nome do Paciente:");
		  String nomepaciente = scanner.next();
		System.out.println("Digite o status de vacina��o:");
		  boolean vacinado = scanner.nextBoolean();
		System.out.println("Dosagem:");
		  Float dose = scanner.nextFloat();
		System.out.println("Digite o per�odo de vacina��o:");
		  String periodo = scanner.next();
		  
	 	 Vacina Adicionar = new Vacina (nomevacina, objetivo, nomepaciente, vacinado, dose, periodo);
	}
	//Atestado - edited by Felipe and Amailson
	public static void adicionarAtestado() {
		System.out.println("Digite o nome do Paciente:");
		  String nomepaciente = scanner.next();
		System.out.println("Digite o nome do M�dico:");
		  String medico = scanner.next();
		System.out.println("Digite a data do atestado:");
		  int dataatestado = scanner.nextInt();
		System.out.println("Digite a data final do atestado:");
		  int fimatestado = scanner.nextInt();
		  
	 	 Atestado Adicionar = new Atestado (nomepaciente, medico, dataatestado, fimatestado);
	}
	//Dose - edited by Felipe and Amailson
	public static void adicionarDose() {
		System.out.println("Digite a dosagem do rem�dio:");
		  float dosagem = scanner.nextFloat();
		System.out.println("Digite o n�mero de doses a serem administradas:");
		  int numerodoses = scanner.nextInt();
		System.out.println("Digite a data da dosagem:");
		  int data = scanner.nextInt();
		  
	 	 Dose Adicionar = new Dose (dosagem, numerodoses, data);
	}
}
