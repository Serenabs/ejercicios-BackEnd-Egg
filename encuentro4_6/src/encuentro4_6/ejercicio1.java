/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro4_6;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ejercicio1 {
    //Crear un programa que dado un número determine si es par o impar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero:");
        num = leer.nextInt();
        if ( (num % 2)==0 )
        {
            System.out.println("El numero ingresado es par");
        }     
        else
        {
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
