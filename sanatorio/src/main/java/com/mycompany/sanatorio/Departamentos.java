/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sanatorio;

/**
 *
 * @author valentino
 */
public class Departamentos {
    
            public interface Nutricion {
            String getTipoDieta();
        }

             public interface ClinicaMedica {
            String recetarRx();
            String recetarSangre();
        }

            public interface Administracion {
            String getCobertura();
            double getDescuento();
            String getVademecum();
        }
}
