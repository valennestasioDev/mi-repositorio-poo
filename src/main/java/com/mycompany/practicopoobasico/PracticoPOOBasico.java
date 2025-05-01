/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicopoobasico;

import java.util.Scanner;

/**
 *
 * @author valentino
 */
public class PracticoPOOBasico {

    public static void main(String[] args) {
        
      int vector [] = new int [6];
      
      
      
      //Asignación por techado
        Scanner teclado = new Scanner (System.in);
      
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese el valor de la nota número" + i);
            vector[i] = teclado.nextInt();
            
        }
      
       
            for (int i = 0; i < vector.length; i++) {
            
                System.out.println("Índice número:" + i);
                System.out.println("Nota:" + vector[i]);
                System.out.println("---");
            
        }    
        
        
        
    }
}
