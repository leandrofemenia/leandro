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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la frase");
        String frase = leer.next();
        
        if (frase.equals("eureka")){
            System.out.println("es correcto");
          } else {
                   System.out.println("es incorrecto");
                   
        }
        // TODO code application logic here
    }
    
}
