package ed.pruebaNivel;

import java.util.Scanner;

public class Dni {

	//Atributos
	private char[]letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
	private int numeroDni;
	private String letraDni;
	

	//Getter & Setter
	public int getNumeroDni() {
		return numeroDni;
	}
	
	public void setNumeroDni(int numeroDni) {
		this.numeroDni = numeroDni;
	}
	
	
	 
	public String getLetraDni() {
		return letraDni;
	}

	public void setLetraDni(String letraDni) {
		this.letraDni = letraDni;
	}

	
	@Override
	public String toString() {
		return "Mostrando DNI [" +numeroDni  +"-"+ letraDni+"]";
	}

	//Métodos
	public char calculaLetraDni(int numDni) {
		int posicionLetra = numDni%23;
		
		return letras[posicionLetra];
		
	}
	
	public int compruebaNumeroDni(int numDniUsuario) {
		Scanner scan = new Scanner(System.in);
		
		while(numDniUsuario<0 || numDniUsuario>99999999) {
			System.err.println("** Error, el número del dni "+ numDniUsuario+" introducido no es válido. **");
			System.out.println("Introduce número de dni");
			numDniUsuario = scan.nextInt();
		}
		
		return numDniUsuario;
	}
	
	public String compruebaLetraDni(int numDniUsuario, String letraDniUsuario) {
		
		Scanner scan = new Scanner(System.in);
		Dni compruebaDni = new Dni();
		while(compruebaDni.calculaLetraDni(numDniUsuario)!=letraDniUsuario.charAt(0)) {
			System.err.println("** Error, la letra del dni " +letraDniUsuario+" introducida no es válida. **");
			System.out.println("Introduce letra de dni");
			letraDniUsuario = scan.next().toUpperCase();			
		}
		return letraDniUsuario;
	}
}
