package saudefacil;

import javax.xml.crypto.Data;

public class Atestado {
	private String nomepaciente;
	private Medico medico;
	private Data dataatestado;
	private Data fimatestado;
	
	public void cadastrar(String nomepaciente, Medico medico, Data dataatestado, Data fimatestado) {
	   System.out.println("Atestado do paciente " + this.getNomepaciente());
	   System.out.println("Medico " + this.getMedico());
	   System.out.println("Período de afastamento " + this.getDataatestado()+ "a" + this.getFimatestado());
	   System.out.println("Atestado adicionado com sucesso!");
		
	}
	
	public void excluir(boolean S, boolean N) {
			System.out.println("Deseja excluir atestado?");
			System.out.println("S para Sim. N para Não. ");
			if (S = true) {
				System.out.println("Atestado do paciente " + this.getNomepaciente() + "excluído com sucesso!");
			} else {
				System.out.println("Retorne ao Menu Principal.");
			}
	}

		public Atestado(String nomepaciente, Medico medico, Data dataatestado, Data fimatestado) {
		super();
		this.nomepaciente = nomepaciente;
		this.medico = medico;
		this.dataatestado = dataatestado;
		this.fimatestado = fimatestado;
	}
	public Atestado(String nomepaciente, String medico, int dataatestado, int fimatestado) {
			// TODO Auto-generated constructor stub
		}

	public String getNomepaciente() {
		return nomepaciente;
	}
	public void setNomepaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Data getDataatestado() {
		return dataatestado;
	}
	public void setDataatestado(Data dataatestado) {
		this.dataatestado = dataatestado;
	}
	public Data getFimatestado() {
		return fimatestado;
	}
	public void setFimatestado(Data fimatestado) {
		this.fimatestado = fimatestado;
	}

}
