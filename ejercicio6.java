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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner Scanner = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmacion;
        
        do {
            System.out.print("Ingrese el primer número: ");
            num1 = Scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = Scanner.nextInt();
            
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.print("Elija una opción: ");
            opcion = Scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir entre cero");
                    } else {
                        System.out.println("El resultado de la división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = Scanner.next().charAt(0);
                    if (Character.toUpperCase(confirmacion) == 'S') {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            
            System.out.println(); // Salto de línea para separar las ejecuciones del menú
        } while (true); // El programa se ejecuta hasta que se seleccione la opción 5
        // TODO code application logic here
        // TODO code application logic here
    }
    
}
