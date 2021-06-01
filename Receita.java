package saudefacil;

import java.awt.image.BufferedImage;

public class Receita {
	private String nomepaciente;
	private Medico medico;
	private Medicamento nomeRemedio;
	private Dose dosagem;
	
	public void cadastrar(String nomepaciente, Medico medico, Medicamento nomeRemedio, BufferedImage imagemreceita, Dose dosagem) {
		   System.out.println("Receita do Paciente:  " + this.getNomePaciente());
		   System.out.println("Consulta com o Médico: "+ this.getMedico());
		   System.out.println("Medicamento receitado: " + this.getNomeRemedio());
		   System.out.println("Dosagem receitada: " + this.getDosagem());
		   System.out.println("Receita adicionada com sucesso!");
			
		}
		
public void excluir(boolean S, boolean N) {
			System.out.println("Deseja excluir receita do paciente: " + this.getNomePaciente() + "fornecida pelo Dr. " + this.getMedico() + "?" );
			System.out.println("S para Sim. N para Não. ");
			if (S = true) {
				System.out.println("Receita excluída com sucesso!");
			} else {
				System.out.println("Retorne ao Menu Principal.");
			}
	}
	
	public Receita(String nomepaciente, Medico medico, Medicamento nomeRemedio, Dose dosagem) {
		super();
		this.nomepaciente = nomepaciente;
		this.medico = medico;
		this.nomeRemedio = nomeRemedio;
		this.dosagem = dosagem;
	}

	public String getNomePaciente() {
		return nomepaciente;	
	}

	public void setNomePaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Medicamento getNomeRemedio() {
		return nomeRemedio;
	}

	public void setNomeRemedio(Medicamento nomeRemedio) {
		this.nomeRemedio = nomeRemedio;
	}

	public Dose getDosagem() {
		return dosagem;
	}

	public void setDosagem(Dose dosagem) {
		this.dosagem = dosagem;
	}


}
