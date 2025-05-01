/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author valentino
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de notas:");
        int cantidadNotas = scanner.nextInt();
        
        double[] notas = new double[cantidadNotas];
        
        double[] aprobados = new double[cantidadNotas];
        double[] desaprobados = new double[cantidadNotas];
         
        int cantidadAprobados = 0;
        int cantidadDesaprobados = 0;
        
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingrese la nota"+(i + 1) +": ");
            notas[i] = scanner.nextDouble();
            
            
            if (notas[i] >= 6) {
                aprobados[cantidadAprobados] = notas[i];
                cantidadAprobados++;               
            }else{
                    desaprobados[cantidadDesaprobados] = notas[i];
                    cantidadDesaprobados++;
                    
                    }
        }
        
        System.out.println("\n--Aprobados(" + cantidadAprobados +") ---");
        for (int i = 0; i < cantidadAprobados; i++) {
            System.out.println("Nota:"+ aprobados[i]);
            
        }
        
        System.out.println("\n --Desaprobados(" + cantidadDesaprobados +") ---");
        for (int i = 0; i < cantidadDesaprobados; i++) {
            System.out.println("Nota:" + desaprobados[i]);
        }
        
        scanner.close();
        
     
    }
}
