/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;
import java.util.Scanner;
/**
 *
 * @author valentino
 * 
 * 
 * 
 */


            class Cliente{

                    String dni;
                    int tipoServicio;
                    double montoPagar;

                public Cliente(String dni, int tipoServicio) {
                    this.dni = dni;
                    this.tipoServicio = tipoServicio;
                    this.montoPagar = calcularMonto(tipoServicio);
                }



            


            private double calcularMonto(int tipo) {

                        return switch (tipo) {
                            case 1 -> 750;
                            case 2 -> 1100;
                            case 3 -> 1500 * 0.95;
                            default -> 0;
                        };


            }

            public void mostrarDatos(){
            
            System.out.println("DNI: " + dni);
            System.out.println("Tipo de servicio: " + tipoServicio);
            System.out.printf("Monto a pagar: $%.2f%n", montoPagar);
            System.out.println("-----------------------------");


            }

            
        }





        public class Mavenproject5 {
        
            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                    Cliente[] clientes = new Cliente[5];
                    
                    System.out.println("FACTURACIÓN PARA 5 CLIENTES\n");
                    
                    for (int i = 0; i < 5; i++) {
                        
                        System.out.println("Cliente n°"+(i  + 1));
                        
                        System.out.println("Facturación para cinco clientes\n");
                        System.out.print("Ingrese DNI del cliente: ");
                        String dni = scanner.nextLine();
                        
                        int tipoServicio;
                        
                        while(true){
                            System.out.println("Seleccione tipo de servicio:");
                            System.out.println("1. Internet 30 megas - $750");
                            System.out.println("2. Internet 50 megas - $1100");
                            System.out.println("3. Internet 100 megas - $1500 (-5% descuento)");
                            System.out.print("Opción (1-3): ");
                            
                            if (scanner.hasNextInt()) {
                                tipoServicio = scanner.nextInt();
                                scanner.nextLine(); 
                                if (tipoServicio >= 1 && tipoServicio <= 3) break;
                            } else {
                                scanner.nextLine(); 
                            }
                            System.out.println("Opción inválida. Intente de nuevo.\n");
                        }
                        
                        clientes[i] = new Cliente(dni, tipoServicio);
                        System.out.println();
                        
                        
                    }
                    
                    System.out.println("RESUMEN DE FACTURACIÓN:\n");
                    for (Cliente c : clientes) {
                        c.mostrarDatos();
                    }
                }
            }   
         
          
        }








