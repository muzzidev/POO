// 18. Escribir un programa en C que imprima “Hola, <nombre>”, siendo <nombre> un argumento.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("hola, " + nombre);
		sc.close();
	}

}
