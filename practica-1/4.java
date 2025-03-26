// 1 Pedir al usuario un nombre y devolver la longitud de caracteres que tiene la cadena .length()
// 2 Ese nombre mostrarlo en Mayusculas .toUpperCase() y minusculas .toLowerCase()
// 3 Pedir el apellido del usuario y concatenarlo en un nuevo String
// 4 Devolver el indice del apellido del usuario.indexOf()

package holamund;

import java.util.Scanner;

public class main {
	
	public static void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        print("CUAL ES TU NAME");
        String nombre = sc.next();
        int tamaño = nombre.length();
        print("ES" + tamaño + "LARGOS");

        String mayus = nombre.toUpperCase();
        String minus = nombre.toLowerCase();

        print(mayus + " EN MAYUSCULA");
        print(minus + " EN MINUSCULA");

        print("CUAL ES EL APELLIDO DE MIERDA?");
        String apellido = sc.next();
        String nombreCompleto = nombre + " " + apellido;
        
        print(nombreCompleto);
        
        int indice = nombreCompleto.indexOf(apellido);
        
        print(indice + "ES EL INDEX");
        
        sc.close();
	}

}
