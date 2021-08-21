package zen.forms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Consulta extends Formulario {
	private String desc;
	private String laudo;
	private Date data;
	private Scanner sc = new Scanner(System.in);
	
	public Consulta(int codigoIdPaciente, int codigoIdPsicologo, String desc, String laudo, Date data, int idFormulario) {
		super();
		this.desc = desc;
		this.laudo = laudo;
		this.data = data;
		this.setIdFormulario(idFormulario);
		this.setCodigoIdPaciente(codigoIdPaciente);
		this.setCodigoIdPsicologo(codigoIdPsicologo);
	}
	
	public Consulta() {
		super();
		this.setTipoFormulario ("consulta");
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLaudo() {
		return laudo;
	}

	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public void cadastrar() {
		
		System.out.print("DIGITE O CODIGO ID DO PACIENTE: ");
		this.setCodigoIdPaciente(sc.nextInt());
		
		System.out.print("DIGITE O CODIGO ID DO PSICÓLOGO: ");
		this.setCodigoIdPsicologo(sc.nextInt());
		
		System.out.print("DIGITE A DATA DA CONSULTA: ");
		String dataString = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date data = sdf.parse(dataString);
			this.setData(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("DIGITE A DESCRIÇÃO DA CONSULTA: ");
		System.out.print("-> ");
		this.setDesc(sc.next());
		
		System.out.println("DIGITE O LAUDO DA CONSULTA: ");
		System.out.print("-> ");
		this.setLaudo(sc.next());
		
		
	}
	
	
}
