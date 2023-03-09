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
public class ejercicio5_dobleTripleRaizc {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero : ");
        num = Integer.parseInt(leer.next());
        int doble = num*2;
        int triple = num*3;
        int raiz = (int) Math.sqrt(num);
        System.out.print("El doble de " + num + " es " + doble);
        System.out.println(", el triple es " + triple + " y la raiz cuadrada redondeada es " + raiz);
    }
    
}
