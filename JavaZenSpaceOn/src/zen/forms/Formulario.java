package zen.forms;

import java.util.Scanner;

public abstract class Formulario {
	private int codigoIdPaciente;
	private int codigoIdPsicologo;
	private int idFormulario;
	private String tipoFormulario;
	private Scanner sc = new Scanner(System.in);

	public int getCodigoIdPaciente() {
		return codigoIdPaciente;
	}

	public void setCodigoIdPaciente(int codigoIdPaciente) {
		this.codigoIdPaciente = codigoIdPaciente;
	}

	public int getCodigoIdPsicologo() {
		return codigoIdPsicologo;
	}

	public void setCodigoIdPsicologo(int codigoIdPsicologo) {
		this.codigoIdPsicologo = codigoIdPsicologo;
	}
	
	public int getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(int idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getTipoFormulario() {
		return tipoFormulario;
	}

	public void setTipoFormulario(String tipoFormulario) {
		this.tipoFormulario = tipoFormulario;
	}

	public void cadastrar() {
		
		System.out.print("DIGITE O CODIGO ID DO PACIENTE: ");
		this.setCodigoIdPaciente(sc.nextInt());
	
		System.out.print("DIGITE O CODIGO ID DO PSICÓLOGO: ");
		this.setCodigoIdPsicologo(sc.nextInt());
		
	}
	
}
