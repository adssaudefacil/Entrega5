package saudefacil;

public class Medicamento {
	private String nomepaciente;
	private String nomeremedio;
	private String horarioremedio;
	private Medico medico;
	private String periodo;
	private float preco;
	
	public void aleta() {
		
	}
	public void cadastrar(String nomepaciente, String nomeremedio, String horarioremedio, Medico medico, String periodo, float preco) {
		   System.out.println("Medicamento do paciente " + this.getNomepaciente());
		   System.out.println("Nome do medicamento: " + this.getNomeremedio());
		   System.out.println("Medicamento receitado pelo Dr. " + this.getMedico());
		   System.out.println("Período de uso do medicamento: " + this.getPeriodo());
		   System.out.println("Preço Medicamento: R$ " + this.getPreco());
		   System.out.println("Medicamento adicionado com sucesso!");
			
		}
		
		public void excluir(boolean S, boolean N) {
				System.out.println("Deseja excluir medicamento" + this.getNomeremedio() + "?");
				System.out.println("S para Sim. N para Não. ");
				if (S = true) {
					System.out.println("Medicamento excluído com sucesso!");
				} else {
					System.out.println("Retorne ao Menu Principal.");
				}
		}
		public Medicamento(String nomepaciente, String nomeremedio, String horarioremedio, Medico medico,
				String periodo, float preco) {
			super();
			this.nomepaciente = nomepaciente;
			this.nomeremedio = nomeremedio;
			this.horarioremedio = horarioremedio;
			this.medico = medico;
			this.periodo = periodo;
			this.preco = preco;
		}
		
		public Medicamento(String nomeRemedio) {
			this.nomeremedio = nomeRemedio;
		}
		
		public Medicamento(String nomepaciente, String nomeremedio, Medico medico, String horarioremedio,
				String periodo, Float preco) {
			// TODO Auto-generated constructor stub
		}
		public String getNomepaciente() {
			return nomepaciente;
		}
		public void setNomepaciente(String nomepaciente) {
			this.nomepaciente = nomepaciente;
		}
		public String getNomeremedio() {
			return nomeremedio;
		}
		public void setNomeremedio(String nomeremedio) {
			this.nomeremedio = nomeremedio;
		}
		public String getHorarioremedio() {
			return horarioremedio;
		}
		public void setHorarioremedio(String horarioremedio) {
			this.horarioremedio = horarioremedio;
		}
		public Medico getMedico() {
			return medico;
		}
		public void setMedico(Medico medico) {
			this.medico = medico;
		}
		public String getPeriodo() {
			return periodo;
		}
		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}


}
