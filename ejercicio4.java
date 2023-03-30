/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              System.out.println("Ingrese una frase");

        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();

        if ("A".equals(frase.substring(0,1)) ){ // substring(inicio, fin) [0,1)
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
            
        }
        // TODO code application logic here
    }
    
}
