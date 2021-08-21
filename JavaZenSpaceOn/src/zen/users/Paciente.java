package zen.users;

public class Paciente extends Usuarios {

	public Paciente(int codigoId, String nome, String senha, String email) {
		super();
		this.codigoId = codigoId;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.tipoUsuario = "paciente";
	}

	public Paciente() {
		super();
		this.tipoUsuario = "paciente";
	}
	
}
