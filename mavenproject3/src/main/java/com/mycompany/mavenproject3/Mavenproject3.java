/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author valentino
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
          // 1. Pedir cantidad de productos
        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        // 2. Crear los vectores
        int[] cantidades = new int[n];
        double[] costos = new double[n];

        double precioTotal = 0;

        // 3. Cargar datos
        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i + 1));
            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();

            System.out.print("Costo unitario: $");
            costos[i] = scanner.nextDouble();
        }

        // 4. Calcular precios totales e imprimir productos que superan $1000
        System.out.println("\n--- Productos con precio total mayor a $1000 ---");
        for (int i = 0; i < n; i++) {
            double subtotal = cantidades[i] * costos[i];
            precioTotal += subtotal;

            if (subtotal > 1000) {
                System.out.printf("Producto %d - Cantidad: %d, Costo unitario: $%.2f, Subtotal: $%.2f\n",
                        (i + 1), cantidades[i], costos[i], subtotal);
            }
        }

        // 5. Mostrar precio total general
        System.out.printf("\nPrecio total de todos los productos: $%.2f\n", precioTotal);

        scanner.close();
    }
}
