package saudefacil;

import java.util.Date;

public class Dose {
	private float dosagem;
	private int numerodoses;
	private Date data;
	
	public void alerta() {
		
	}

	public void cadastrar(float dosagem, int numerodoses, Date data) {
		   System.out.println("Dosagem (quantidade em ml):  " + this.getDosagem());
		   System.out.println("Numero de doses a serem tomadas: " + this.getNumerodoses());
		   System.out.println("Data da dose: " + this.getData());
		   System.out.println("Dose adicionada com sucesso!");
			
		}
		
public void excluir(boolean S, boolean N) {
			System.out.println("Deseja excluir dose? " + this.getClass());
			System.out.println("S para Sim. N para Não. ");
			if (S = true) {
				System.out.println("Dose excluída com sucesso!");
			} else {
				System.out.println("Retorne ao Menu Principal.");
			}
	}

public Dose(float dosagem, int numerodoses, Date data) {
	super();
	this.dosagem = dosagem;
	this.numerodoses = numerodoses;
	this.data = data;
}

public Dose(float dosagem) {
	this.dosagem = dosagem;
	this.numerodoses = 1;
	this.data = new Date();
}

public Dose(float dosagem, int numerodoses, int data) {
	// TODO Auto-generated constructor stub
}

public float getDosagem() {
	return dosagem;
}

public void setDosagem(float dosagem) {
	this.dosagem = dosagem;
}

public int getNumerodoses() {
	return numerodoses;
}

public void setNumerodoses(int numerodoses) {
	this.numerodoses = numerodoses;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}
	
}
