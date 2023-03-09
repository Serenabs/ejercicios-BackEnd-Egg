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
public class ejercicio1_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese el valor del numero 1:");
        num1 = Integer. parseInt(leer.next());
        int num2;
        System.out.println("Ingrese el valor del numero 2:");
        num2 = Integer. parseInt(leer.next());
        int suma = num1+num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);
    }
    
}
