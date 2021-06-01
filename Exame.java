package saudefacil;

import java.util.Date;

public class Exame {
	private String tipo;
	private String nomepaciente;
	private Date dataexame;
	private Date dataresultado;
	private float preco;
	private Clinica nome;
	private Clinica endereco;
	private boolean status;
	
	public void alerta() {
		
	}
	
	public void cadastrar(String nomepaciente, String tipo, Date dataexame, Date dataresultado, float preco, Clinica endereco) {
		   System.out.println("Exame do paciente " + this.getNomepaciente());
		   System.out.println("Exame do Tipo: " + this.getTipo());
		   System.out.println("Data do Exame: " + this.getDataexame());
		   System.out.println("Data Resultado do Exame: " + this.getDataresultado());
		   System.out.println("Preço do Exame: " + this.getPreco());
		   System.out.println("O Exame será realizado na Clínica: " + this.getNome() + "Endereço: " + this.getEndereco());
		   System.out.println("Exame adicionado com sucesso!");
			
		}
		
	public void excluir(boolean S, boolean N) {
				System.out.println("Deseja excluir exame?");
				System.out.println("S para Sim. N para Não. ");
				if (S = true) {
					System.out.println("Exame" + this.getTipo() + " do paciente " + this.getNomepaciente() + "excluído com sucesso!");
				} else {
					System.out.println("Retorne ao Menu Principal.");
				}
				
	}		

	public Exame(String tipo, String nomepaciente, Date dataexame, Date dataresultado, float preco, Clinica nome, Clinica endereco,
			boolean status) {
		super();
		this.tipo = tipo;
		this.nomepaciente = nomepaciente;
		this.dataexame = dataexame;
		this.dataresultado = dataresultado;
		this.preco = preco;
		this.nome = nome;
		this.endereco = endereco;
		this.status = status;
	}

	public Exame(Date dataexame) {
		this.dataexame = dataexame;
		// TODO Auto-generated constructor stub
	}

	public Exame(String nomepaciente, String tipo, String dataexame, String dataresultado, Float preco,
			Clinica nomeclinica, String enderecoclinica, boolean status) {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomepaciente() {
		return nomepaciente;
	}

	public void setNomepaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}

	public Date getDataexame() {
		return dataexame;
	}

	public void setDataexame(Date dataexame) {
		this.dataexame = dataexame;
	}

	public Date getDataresultado() {
		return dataresultado;
	}

	public void setDataresultado(Date dataresultado) {
		this.dataresultado = dataresultado;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Clinica getEndereco() {
		return endereco;
	}

	public void setEndereco(Clinica endereco) {
		this.endereco = endereco;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Clinica getNome() {
		return nome;
	}

	public void setNome(Clinica nome) {
		this.nome = nome;
	}
	
	
}

	

	