/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;


import java.util.Scanner;

class Camion {
    String patente;
    String choferNombre;
    String tipoCarga;
    String horaEgreso;

    public Camion(String patente, String choferNombre, String tipoCarga, String horaEgreso) {
        this.patente = patente;
        this.choferNombre = choferNombre;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }
}

public class Mavenproject4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Camion[] camiones = new Camion[30];
            int contadorTe = 0;
            
            System.out.println("Carga de datos de 30 camiones:\n");
            
            for (int i = 0; i < camiones.length; i++) {
                System.out.println("Camión #" + (i + 1));
                
                System.out.print("Patente: ");
                String patente = scanner.nextLine();
                
                System.out.print("Nombre y apellido del chofer: ");
                String chofer = scanner.nextLine();
                
                String carga = "";
                boolean cargaValida = false;
                
                while (!cargaValida) {
                    System.out.println("Seleccione el tipo de carga:");
                    System.out.println("1. Madera");
                    System.out.println("2. Yerba");
                    System.out.println("3. Té");
                    System.out.print("Opción (1-3): ");
                    
                    int opcion = 0;
                    if (scanner.hasNextInt()) {
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        scanner.nextLine();
                        System.out.println("Entrada inválida. Ingrese un número del 1 al 3.");
                        continue;
                    }
                    
                    switch (opcion) {
                        case 1:
                            carga = "madera";
                            cargaValida = true;
                            break;
                        case 2:
                            carga = "yerba";
                            cargaValida = true;
                            break;
                        case 3:
                            carga = "té";
                            cargaValida = true;
                            contadorTe++;
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                            break;
                    }
                }
                
                System.out.print("Hora de egreso (formato HH:MM): ");
                String horaEgreso = scanner.nextLine();
                
                camiones[i] = new Camion(patente, chofer, carga, horaEgreso);
                System.out.println();
            }
            
            
            System.out.println("\n--- LISTADO DE CAMIONES ---");
            for (int i = 0; i < camiones.length; i++) {
                Camion c = camiones[i];
                System.out.println("Camión #" + (i + 1));
                System.out.println("Patente: " + c.patente);
                System.out.println("Chofer: " + c.choferNombre);
                System.out.println("Tipo de carga: " + c.tipoCarga);
                System.out.println("Hora de egreso: " + c.horaEgreso);
                System.out.println("----------------------------");
            }
            
            System.out.println("Cantidad de camiones que transportaron té: " + contadorTe);
        }
    }
}
    

