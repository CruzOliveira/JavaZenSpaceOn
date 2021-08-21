package zen.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zen.forms.Avaliacao;
import zen.forms.Consulta;
import zen.forms.Formulario;
import zen.users.Administrador;
import zen.users.Paciente;
import zen.users.Psicologo;
import zen.users.Usuarios;

public class Controller {
	private List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
	private List<Formulario> listaFormularios = new ArrayList<Formulario>();
	private Paciente paciente = new Paciente();
	private Psicologo psicologo = new Psicologo();
	private Administrador adm = new Administrador();
	private Consulta consulta = new Consulta();
	private Avaliacao avaliacao = new Avaliacao();
	private Scanner sc = new Scanner(System.in);
	
	// Menu
	public void menu() {
		System.out.println("SISTEMA DE CADASTRO DE USU�RIOS");
		System.out.println("---------------------------------");
		System.out.println("SELECIONE A OP��O DESEJADA");
		System.out.println("1 - CADASTRAR USUARIO");
		System.out.println("2 - CADASTRAR CONSULTA");
		System.out.println("3 - CADASTRAR AVALIA��O");
		System.out.println("4 - MOSTRAR USUARUOS");
		System.out.println("5 - MOSTRAR FORMULARIOS");
		System.out.println("---------------------------------");
	}
	
	// M�todo para cadastrar usu�rio
	public void cadastrarUsuario(Usuarios usuario) {
		listaUsuarios.add(usuario);
		System.out.println("Usu�rio cadastrado!");
	}

	
	// M�todo para cadastrar formul�rio
	public void cadastrarFormulario(Formulario formulario) {
		listaFormularios.add(formulario);
		System.out.println("Formu�rio cadastrado!");
	}
	
	// M�todo para mostrar usu�rios	
	public void mostrarUsuarios() {
		for (Usuarios usuario : listaUsuarios) {
			System.out.println("TIPO DE USUARIO: " + usuario.getTipoUsuario().toUpperCase());
			System.out.println("NOME: " + usuario.getNome().toUpperCase());
			System.out.println("---------------------------------");
		}
	}
	
	// M�todo para mostrar usu�rios	
	@SuppressWarnings("deprecation")
	public void mostrarFormularios() {
		for (Formulario formulario : listaFormularios) {
			System.out.println("TIPO DE FORMULARIO: " + formulario.getTipoFormulario().toUpperCase());
			System.out.println("C�DIGO ID DO FORMUL�RIO: " + formulario.getIdFormulario());
			if (formulario.getTipoFormulario().equals("consulta")) {
			System.out.println("DATA DA CONSULTA: " + consulta.getData().toGMTString());
			}
			System.out.println("---------------------------------");
		}
	}
	
	// M�todo executar
	public void execute(int op) {
		if (op == 1) {
			// Selecionando o tipo de usu�rio que deseja cadastrar
			System.out.println("SELECIONE O TIPO DE USUARIO QUE VAI CADASTRAR");
			System.out.println("1 - ADMINISTRADOR");
			System.out.println("2 - PACIENTE");
			System.out.println("3 - PSIC�LOGO");
			System.out.print("DIGITE A OP��O: ");
			int tipo = sc.nextInt();
	
			if (tipo == 1) {
				adm.cadastrar();
				this.cadastrarUsuario(adm);
			} else if (tipo == 2) {
				paciente.cadastrar();
				this.cadastrarUsuario(paciente);
			} else {
				psicologo.cadastrar();
				this.cadastrarUsuario(psicologo);
			}
		} else if (op == 2) {
			// M�todo para criar consulta
			consulta.cadastrar();
			this.cadastrarFormulario(consulta);
		} else if (op == 3) {
			// M�todo para dar avalia��o
			avaliacao.cadastrar();
			this.cadastrarFormulario(avaliacao);
		} else if (op == 4) {
			this.mostrarUsuarios();
		} else if (op == 5) {
			this.mostrarFormularios();
		}else {
			System.out.println("OP��O INV�LIDA...");
		}
	}
	
	
}
