package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author valentino
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    
        
        
        System.out.println("Ingrese la cantidad de notas deseadas:");
        int cantidadNotas = scanner.nextInt();
        
        double[] notas = new double[cantidadNotas];
        
        double suma = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;
        
        
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingrese la nota" + (i + 1)+":");
            notas[i] = scanner.nextDouble();
            
            suma +=notas[i];
            
                        if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }

            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        
        double promedio = suma / cantidadNotas;
        
        System.out.println("notas ingresadas:");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Nota"+(i+1) + ":"+ notas[i]);
        }
        
            System.out.printf("\nPromedio: %.2f\n", promedio);
            System.out.println("Nota más alta: " + notaMayor);
            System.out.println("Nota más baja: " + notaMenor);

            scanner.close();
        
        
    }
}
