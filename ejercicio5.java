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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);
         System.out.println("escriba un numero");
         int num = leer.nextInt();
         int suma = 0;
         int contador = 1;
         
         while (suma<=num){
             System.out.println("ingrese un "+ contador +" ");
             int numero = leer.nextInt();
             suma +=numero;
             contador++;
             }
             System.out.println("la suma de los numeros introducidos es" + suma + " es mayor que el limite" + num);
                     
       
    }
    
}

  
        
    
