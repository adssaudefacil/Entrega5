package saudefacil;

public class Clinica {
	private String avaliacao;
	private String nomeclinica;
	private String endereco;
	private String email;
	private long telefone;
	
	public void cadastrar(String nome, String endereco, String email, long telefone) {
		   System.out.println("Clinica " + this.getNomeClinica());
		   System.out.println("Endere�o: " + this.getEndereco());
		   System.out.println("Email da Cl�nica:  " + this.getEmail());
		   System.out.println("Telefone de Contato da Cl�nica: " + this.getTelefone());
		   System.out.println("Cl�nica adicionada com sucesso!");
			
		}
		
	public void excluir(boolean S, boolean N) {
				System.out.println("Deseja excluir registro da Cl�nica?");
				System.out.println("S para Sim. N para N�o. ");
				if (S = true) {
					System.out.println("Clinica: " + this.getNomeClinica() + "exclu�da com sucesso!");
				} else {
					System.out.println("Retorne ao Menu Principal."); 
					}
				
	}
	
	public void avaliacao(String nome, boolean R, boolean B, boolean E) {
		System.out.println("Como voc� avalia a Cl�nica: " + this.getNomeClinica() + "?");
		System.out.println("Responda: R - Ruim, B - Boa, E - Excelente. ");
		if (R = true) {
			System.out.println("Cl�nica Ruim");
			
		} else if (B = true) {
			System.out.println("Cl�nica Boa");
			
		} else if (E = true){
			System.out.println("Cl�nica Excelente!");
			
		} else {
			System.out.println("Cl�nica n�o avaliada.");
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
