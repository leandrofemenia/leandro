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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
        String fde;
        int i = 0, j = 0;

        do {
            System.out.println("Ingrese una cadena que empiece con X y terminen con O y contenga 5 caracteres");
            fde = input.nextLine();

            if (fde.length() == 5 && fde.substring(0, 1).equals("X") && fde.substring(4, 5).equals("O")) {
                i++;
                System.out.println("FDE CORRECTO");
            } else {
                if ("&&&&&".equals(fde)) {
                    break;
                }
                j++;
                System.out.println("FDE INCORRECTO");
            }            
        } while (!"&&&&&".equals(fde));
        System.out.println("El FDE se ingreso correctamente: " + i + " veces.");
        System.out.println("El FDE se ingreso incorrectamente: " + j + " veces.");
    }
}
        
       
           
        
        // TODO code application logic here
    
    

