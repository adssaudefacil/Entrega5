package saudefacil;


public class Medico extends Pessoa {
	private String especialidade;
	private int crm;
	
	@Override
	public void cadastrar() {
		System.out.println("Médico " + this.getNome() + "cadastrado com sucesso!" );
		
	}

	public void excluir(boolean S, boolean N) {
			super.excluir(S, N);
			System.out.println("Deseja excluir resgistro do Familiar: " + this.getNome() + "?");
			System.out.println("S para Sim. N para Não. ");
			if (S = true) {
				System.out.println("Familiar" + this.getNome() + "excluído com sucesso!");
			} else {
				System.out.println("Retorne ao Menu Principal.");
			}
	}

	
	public Medico(String nome, String endereco, String email, long telefone, String especialidade,
			int crm) {
		super(nome, endereco, email, telefone);
		this.especialidade = especialidade;
		this.crm = crm;
	}
	
	public Medico(String nome) {
		super(nome);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	

	

}
