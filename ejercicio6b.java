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
public class ejercicio6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String salir;
        int num1, num2, opcion;

        do {

            System.out.println("Ingrese el primer numero para operar");
            num1 = input.nextInt();
            System.out.println("Ingrese el segundo numero para operar");
            num2 = input.nextInt();
            salir = "n";

            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Sumando numeros " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Restando numeros " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicando numeros " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Dividiendo numeros " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = input.next();
                    if ("s".equalsIgnoreCase(salir)) {
                        System.out.println("Saliendo del programa...");
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while ("n".equalsIgnoreCase(salir));
    }
}
        // TODO code application logic here
    
    

