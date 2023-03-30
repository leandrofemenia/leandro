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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de lados del cuadrado:");
        int lado = input.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado-1 || j ==0 || j == lado-1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
           
            }
            System.out.println("");
        }
    
    }
       }
        // TODO code application logic here
    
    
