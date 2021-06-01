package saudefacil;

import java.awt.image.BufferedImage;
import javax.xml.crypto.Data;

public class Vacina {
	private String nomevacina;
	private String objetivo;
	private String nomepaciente;
	private boolean vacinado;
	private Dose dose;
	private Data periodo;
	
	public void alerta() {
		
	}
	
	public void cadastrar(String nomevacina, String objetivo, String nomepaciente, Dose dose, Data periodo) {
			   System.out.println("Vacina:  " + this.getNomevacina());
			   System.out.println("Objetivo da Vacina: "+ this.getObjetivo());
			   System.out.println("Paciente: "+ this.getNomepaciente());
			   System.out.println("Dosagem: "+ this.getDose());
			   System.out.println("Data Vacinação: " + this.getPeriodo());
			   System.out.println("Vacina adicionada com sucesso!");
				
			}
			
	public void excluir(boolean S, boolean N) {
				System.out.println("Deseja excluir vacina?");
				System.out.println("S para Sim. N para Não. ");
				if (S = true) {
					System.out.println("Vacina excluída com sucesso!");
				} else {
					System.out.println("Retorne ao Menu Principal.");
				}
		}

	public Vacina(String nomevacina, String objetivo, String nomepaciente, boolean vacinado, Dose dose, Data periodo) {
		super();
		this.nomevacina = nomevacina;
		this.objetivo = objetivo;
		this.nomepaciente = nomepaciente;
		this.vacinado = vacinado;
		if (vacinado = true) {
			System.out.println("Paciente " + this.nomepaciente + "já vaciando no dia: " + this.periodo);
		} else {
			System.out.println ("Paciente" + this.nomepaciente + "ainda não foi vacinado. ");
		}
		this.dose = dose;
		this.periodo = periodo;
	}

	public Vacina(String nomevacina, String objetivo, String nomepaciente, boolean vacinado, Float dose,
			String periodo) {
		// TODO Auto-generated constructor stub
	}

	public String getNomevacina() {
		return nomevacina;
	}

	public void setNomevacina(String nomevacina) {
		this.nomevacina = nomevacina;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getNomepaciente() {
		return nomepaciente;
	}

	public void setNomepaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	public Dose getDose() {
		return dose;
	}

	public void setDose(Dose dose) {
		this.dose = dose;
	}

	public Data getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Data periodo) {
		this.periodo = periodo;
	}
	
}
