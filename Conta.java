package saudefacil;

public class Conta {
	private String login;
	private String senha;
	
	public Conta(String email, String senha) {
		this.login = email;
		this.senha = senha;
		
	}
		
	public void acesso() {
		
			if (login == this.getLogin() && senha == this.getSenha()) {
			System.out.println("Bem-Vindo!");

		    } else {
			System.out.println("Acesso negado: Login ou senha incorreto. ");
		   }
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
