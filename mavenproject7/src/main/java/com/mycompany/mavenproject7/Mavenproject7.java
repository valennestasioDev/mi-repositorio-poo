/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author valentino
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int totalCensados = 0;
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        int hombresEdadActiva = 0;
        int mayorEdad = -1;
        int documentoMayor = 0;
        int sexoMayor = 0;
        int sexo;
        
        while(true){
            System.out.println("Ingrese un número de documento, si desea finalizar ingrese 0:");
            int dni = scanner.nextInt();
            
            if (dni == 0) break;
            
            System.out.println("Ingrese edad: ");
            int edad = scanner.nextInt();
            
            
            
            totalCensados++;
            
                    while (true) {
               System.out.println("Ingrese sexo (1 = Mujer / 2 = Hombre):");
               sexo = scanner.nextInt();

               if (sexo == 1 || sexo == 2) {
                   break; // válido, salgo del while interno
               } else {
                   System.out.println("⚠️ Sexo inválido. Ingrese 1 (Mujer) o 2 (Hombre).");
               }
           }

            
            switch(sexo){
        
               case 1: // Mujer
                    cantidadMujeres++;
                    break;
                case 2: // Varón
                    cantidadHombres++;
                    if (edad >= 16 && edad <= 65) {
                        hombresEdadActiva++;
                    }
                    break;
               
        
        
        
        
            }
            
            if (edad > mayorEdad) {
                mayorEdad = edad;
                documentoMayor = dni;
                sexoMayor = sexo;
                
            }
            System.out.println("");
        
        }

        double porcentajeHombresActivos = 0;
        if (cantidadHombres > 0) {
            porcentajeHombresActivos = (hombresEdadActiva * 100.0) / cantidadHombres;
        }

        System.out.println("\n RESULTADOS DEL CENSO:");
        System.out.println("Total de personas censadas: " + totalCensados);
        System.out.println("Cantidad de varones: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
        System.out.printf("Porcentaje de varones entre 16 y 65 años: %.2f%%\n", porcentajeHombresActivos);

        if (mayorEdad != -1) {
            System.out.println("\n Persona con mayor edad:");
            System.out.println("DNI: " + documentoMayor);
            System.out.println("Edad: " + mayorEdad);
            System.out.println("Sexo: " + (sexoMayor == 1 ? "Mujer" : "Varón"));
        }

        scanner.close();
        
        
        
        
        
    }
}
