package br.com.victoria.ExercicioSpringBoot.Model;

public class Usuario {
	int id;
	String login;
	String email;
	String nomeC;
	String senha;
	int perfilAcesso;
	
	public Usuario(int id, String login, String email, String nomeC, String senha, int perfilAcesso) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.nomeC = nomeC;
		this.senha = senha;
		this.perfilAcesso = perfilAcesso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeC() {
		return nomeC;
	}

	public void setNomeC(String nomeC) {
		this.nomeC = nomeC;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(int perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	public String toString() {
		return "Id: " + id + "Login: " + login + "Email: " + email + "Nome Completo: " + nomeC 
				+ "Senha: " + senha + "Perfil de Acesso: " + perfilAcesso;
	}

}
