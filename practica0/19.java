// Escribir un programa en Java que imprima “Hola mundo” cincuenta veces.

package holamundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		for(int i = 0; i < 50; i++) {
			System.out.println("hola, " + nombre);
		}
		sc.close();
	}

}