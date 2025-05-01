/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;
import java.util.Scanner;
/**
 *
 * @author valentino
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
            int[] vehiculos = new int[12];
            double[] tiempos = new double[12];
            
            
                System.out.println("Registro de tiempos para doce corredores:\n");
                
                    for (int i = 0; i < 12; i++) {
                        System.out.println("Competidor n°" +(i + 1));
                        
                        System.out.println("Número de vehiculo: ");
                        vehiculos[i] = scanner.nextInt();
                        
                        System.out.println("Tiempo en segundos: ");
                        tiempos[i] = scanner.nextDouble();
                        
                        System.out.println();
                                         
                    }
                    
                    double mejorTiempo = tiempos [0];
                    int vehiculoGanador = vehiculos [0];
                    
                    
                    for (int i = 0; i < 12; i++) {
            
                        if (tiempos[i] < mejorTiempo) {
                            mejorTiempo = tiempos[i];
                            vehiculoGanador = vehiculos[i];
                            
                        }
                        
                        
                    }
        
                    System.out.println("El vehiculo ganador es el:" + vehiculoGanador);
                    System.out.println("Mejor tiempo registrado: " + mejorTiempo);
        
        
        
        
        
    }
}
