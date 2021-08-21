package zen.users;

import java.util.Scanner;

public abstract class Usuarios {
	protected int codigoId;
	protected String nome;
	protected String senha;
	protected String email;
	protected String tipoUsuario;
	protected Scanner sc = new Scanner(System.in);
	
	public int getCodigoId() {
		return codigoId;
	}
	
	public void setCodigoId(int codigoId) {
		this.codigoId = codigoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Método cadastrar usuario
	public void cadastrar() {
		
		
		System.out.print("INFORME O NOME: ");
		String nome = sc.next();
		this.setNome(nome);
		
		System.out.print("INFORME A SENHA: ");
		String senha = sc.next();
		this.setSenha(senha);
		
		System.out.print("INFORME O EMAIL: ");
		String email = sc.next();
		this.setEmail(email);
	}
	
	
}
