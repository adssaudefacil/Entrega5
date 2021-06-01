package saudefacil;

import javax.xml.crypto.Data;

public class Consulta {
	private long codigoconsulta;
	private Data dataconsulta;
	private int horario;
	private Medico medico;
	private Medico especialidade;
	private String paciente;
	private boolean status;
	
	public void alerta () {
		
	}
	
	public void cadastrar(String paciente, Data dataconsulta, int horario, Medico medico) {
		   System.out.println("Consulta do Paciente:  " + this.getPaciente());
		   System.out.println("Data da Consulta: " + this.getData_consulta());
		   System.out.println("Horário da Consulta: "+ this.getHorario());
		   System.out.println("Consulta com o Médico: "+ this.getMedico());
		   System.out.println("Especialidade: " + this.getEspecialidade());
		   System.out.println("Consulta adicionada com sucesso!");
			
		}
		
public void excluir(boolean S, boolean N) {
			System.out.println("Deseja excluir consulta de codigo: " + this.getCodigoconsulta() );
			System.out.println("S para Sim. N para Não. ");
			if (S = true) {
				System.out.println("Consulta excluída com sucesso!");
			} else {
				System.out.println("Retorne ao Menu Principal.");
			}
	}

	
	public Consulta(long codigoconsulta, int dataconsulta, int horario, String medico, String especialidade, String paciente, boolean status) {
		this.codigoconsulta = codigoconsulta;
		this.dataconsulta = dataconsulta;
		this.horario = horario;
		this.medico = medico;
		this.especialidade = especialidade;
		this.paciente = paciente;
		this.status = status;
	}

	public Data getData_consulta() {
		return dataconsulta;
	}

	public void setData_consulta(Data data_consulta) {
		this.dataconsulta = data_consulta;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Data getDataConsulta() {
		return dataconsulta;
	}

	public void setDataConsulta(Data dataConsulta) {
		this.dataconsulta = dataConsulta;
	}

	public Medico getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Medico especialidade) {
		this.especialidade = especialidade;
	}

	public long getCodigoconsulta() {
		return codigoconsulta;
	}

	public void setCodigoconsulta(long codigoconsulta) {
		this.codigoconsulta = codigoconsulta;
	}
	
	

	
	

}
