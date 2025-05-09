/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sanatorio;

/**
 *
 * @author valentino
 */
public class Sanatorio {

     public static void main(String[] args) {
        Pediatrico pediatrico1 = new Pediatrico("123", "Juanito", "OSDE", 20.5, "379455000", "María"); 
        Adulto adulto1 = new Adulto("456", "Pedro", "Swiss Medical", 120, 1.75, 80);
        Internado internado1 = new Internado("789", "Carlos", "IOMA", "B203", 130, "O+");

        
        System.out.println("=== DEPARTAMENTO DE ADMINISTRACIÓN ===");
        System.out.println(pediatrico1.getCobertura());
        System.out.println(pediatrico1.getDescuento());
        System.out.println(pediatrico1.getVademecum());

        System.out.println(adulto1.getCobertura());
        System.out.println(adulto1.getDescuento());
        System.out.println(adulto1.getVademecum());

        System.out.println(internado1.getCobertura());
        System.out.println(internado1.getDescuento());
        System.out.println(internado1.getVademecum());

        System.out.println("\n=== DEPARTAMENTO DE NUTRICIÓN ===");
        System.out.println(pediatrico1.getTipoDieta());
        System.out.println(internado1.getTipoDieta());

        System.out.println("\n=== DEPARTAMENTO DE CLÍNICA MÉDICA ===");
        System.out.println(adulto1.recetarRx());
        System.out.println(adulto1.recetarSangre());
        System.out.println(internado1.recetarRx());
        System.out.println(internado1.recetarSangre()); 
         
        
        
        
        
      //  System.out.println(pediatrico1.getTipoDieta());       
        //System.out.println(adulto1.recetarRx());
        //System.out.println(internado1.getCobertura());
    } 
    
    
    
    
   
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    

    
    
    

