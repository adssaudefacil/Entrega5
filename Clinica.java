package saudefacil;

public class Clinica {
	private String avaliacao;
	private String nomeclinica;
	private String endereco;
	private String email;
	private long telefone;
	
	public void cadastrar(String nome, String endereco, String email, long telefone) {
		   System.out.println("Clinica " + this.getNomeClinica());
		   System.out.println("Endereço: " + this.getEndereco());
		   System.out.println("Email da Clínica:  " + this.getEmail());
		   System.out.println("Telefone de Contato da Clínica: " + this.getTelefone());
		   System.out.println("Clínica adicionada com sucesso!");
			
		}
		
	public void excluir(boolean S, boolean N) {
				System.out.println("Deseja excluir registro da Clínica?");
				System.out.println("S para Sim. N para Não. ");
				if (S = true) {
					System.out.println("Clinica: " + this.getNomeClinica() + "excluída com sucesso!");
				} else {
					System.out.println("Retorne ao Menu Principal."); 
					}
				
	}
	
	public void avaliacao(String nome, boolean R, boolean B, boolean E) {
		System.out.println("Como você avalia a Clínica: " + this.getNomeClinica() + "?");
		System.out.println("Responda: R - Ruim, B - Boa, E - Excelente. ");
		if (R = true) {
			System.out.println("Clínica Ruim");
			
		} else if (B = true) {
			System.out.println("Clínica Boa");
			
		} else if (E = true){
			System.out.println("Clínica Excelente!");
			
		} else {
			System.out.println("Clínica não avaliada.");
		}
		
	}
				
	
	public Clinica(String avaliacao, String nomeclinica, String enderecoclinica, String email, long telefone) {
		super();
		this.avaliacao = avaliacao;
		this.nomeclinica = nomeclinica;
		this.endereco = enderecoclinica;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Clinica (String nome) {
		this.nomeclinica = nomeclinica;
	}
	
	public String getAvaliacaoo() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getNomeClinica() {
		return nomeclinica;
	}
	public void setNomeClinica(String nome) {
		this.nomeclinica = nomeclinica;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	

}
