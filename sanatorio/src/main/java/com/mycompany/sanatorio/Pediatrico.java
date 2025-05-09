/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sanatorio;

import com.mycompany.sanatorio.Departamentos.Nutricion;

/**
 *
 * @author valentino
 */
public class Pediatrico extends Paciente implements Nutricion {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public String getCobertura() {
        return "Cobertura pediátrica de " + obraSocial;
    }

    @Override
    public double getDescuento() {
        return 0.20;
    }

    @Override
    public String getVademecum() {
        return "Vademecum pediátrico";
    }

    @Override
    public String getTipoDieta() {
        return "Dieta blanda para pediátrico";
    }
}
