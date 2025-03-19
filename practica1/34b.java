// Un programa que tome dos argumentos enteros positivos e imprima “verdadero” si alguno de los argumentos
// es divisible por el otro.

package holamundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 % num2 == 0 || num2 % num1 == 0){
			System.out.println("verdadero");
		} else {
			System.out.println("falso");
		}
		sc.close();
	}

}
