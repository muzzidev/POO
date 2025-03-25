package holamundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("CANTIDAD DE NOTAS DE MIERDA");
        int cantidad = sc.nextInt();
        double total = 0;
        
        for(int i = 0; i < cantidad; i++) {
            System.out.println("INGRESE LA NOTA NRO "+(i+1));
            total += sc.nextDouble();
        }
        
        double promedio = total / cantidad;
        int promedioInt = (int) promedio;
        
        System.out.println(String.format("EN DOUBLE %.2f", promedio));
        System.out.println("EN INT: " + promedioInt);
        sc.close();
	}

}
