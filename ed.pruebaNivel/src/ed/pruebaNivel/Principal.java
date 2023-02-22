package ed.pruebaNivel;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Dni dni1 = new Dni();
		
		int numDniUsuario;
		System.out.println("Introduce número de dni");
		numDniUsuario = scan.nextInt();
		
		String letraDniUsuario;
		System.out.println("Introduce letra de dni");
		letraDniUsuario = scan.next().toUpperCase();
		

		numDniUsuario = dni1.compruebaNumeroDni(numDniUsuario);
		letraDniUsuario = dni1.compruebaLetraDni(numDniUsuario, letraDniUsuario);
		System.out.println("Dni registrado. El número "+numDniUsuario + " y la letra "+ letraDniUsuario +" son correctas.");
		dni1.setNumeroDni(numDniUsuario);
		dni1.setLetraDni(letraDniUsuario);
		
		System.out.println(dni1.toString());
		
		scan.close();
	}

}
