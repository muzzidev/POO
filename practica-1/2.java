// 2 Convertir una tempreatura Celcius(double) a Fahrenheit(int) (formula: 0 °C × 9/5) + 32 = 32 °F)

package holamundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("INGRESAR TEMPERA TURA EN CELSIUS");
        double cantidad = sc.nextDouble();
        int fahr = (int) (cantidad * 9) / 5 + 32;
        
        double promedio = total / cantidad;
        int promedioInt = (int) promedio;
        
        System.out.println(String.format("EN DOUBLE %.2f", promedio));
        System.out.println("EN INT: " + promedioInt);
        sc.close();
	}

}
