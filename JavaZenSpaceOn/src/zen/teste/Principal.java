package zen.teste;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Classe TESTE
		Controller ctrl = new Controller();
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while(continuar) {
			ctrl.menu();
			System.out.print("DIGITE A OPÇÃO: ");
			int op = sc.nextInt();
			ctrl.execute(op);
			
			System.out.println("DESEJA CONTINUAR[S/N]: ");
			String vai = sc.next();
			if (vai.toUpperCase().startsWith("N")) {
				continuar = false;				
			}
			
		}	
		
		sc.close();
	}
}
