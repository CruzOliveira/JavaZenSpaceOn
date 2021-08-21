package zen.forms;

import java.util.Scanner;

public class Avaliacao extends Formulario{
	private String feedback;
	private double nota;
	private Scanner sc = new Scanner(System.in);
	
	
	public Avaliacao(int codigoIdPaciente, int codigoIdPsicologo, String feedback, double nota, int idFormulario) {
		super();
		this.setCodigoIdPaciente(codigoIdPaciente);
		this.setCodigoIdPsicologo(codigoIdPsicologo);
		this.feedback = feedback;
		this.nota = nota;
		this.setIdFormulario(idFormulario);;
	}
	
	public Avaliacao() {
		super();
		this.setTipoFormulario("avaliacao");
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public void cadastrar() {
		
		System.out.print("DIGITE O CODIGO ID DO PACIENTE: ");
		this.setCodigoIdPaciente(sc.nextInt());
		
		System.out.print("DIGITE O CODIGO ID DO PSICÓLOGO: ");
		this.setCodigoIdPsicologo(sc.nextInt());
		
		System.out.print("DIGITE SUA NOTA DE 0 A 5: ");
		this.setNota(sc.nextDouble());
		
		System.out.println("DIGITE SEU FEEDBACK: ");
		System.out.println("-> ");
		this.setFeedback(sc.next());
		
	}
}
