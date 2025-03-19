// Escribir un programa en Java que acepte tres argumentos por línea de comandos e imprima un saludo para los tres
// nombres ingresados al revés de como fueron ingresados

package holamundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre1 = sc.nextLine();
		String nombre2 = sc.nextLine();
		String nombre3 = sc.nextLine();
		System.out.println(nombre3 + " " + nombre2 + " " + nombre1);
		sc.close();
	}

}