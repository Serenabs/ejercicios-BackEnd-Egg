/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ejercicio4_coversorTemperatura {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int gCentigrados;
        System.out.println("Ingrese la temperatura en grados: ");
        gCentigrados = Integer.parseInt(leer.next());
        int gFahrenheit = 32 + (9 * gCentigrados / 5);
        System.out.println("La temperatura en Fahrenheit es: " + gFahrenheit);
        
    }
}
