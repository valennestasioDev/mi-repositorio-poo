/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sanatorio;

import com.mycompany.sanatorio.Departamentos.ClinicaMedica;
import com.mycompany.sanatorio.Departamentos.Nutricion;

/**
 *
 * @author valentino
 */
public class Internado extends Paciente implements Nutricion, ClinicaMedica {
    private String habitacion;
    private double presionArterial;
    private String rh;

    public Internado(String dni, String nombre, String obraSocial, String habitacion, double pa, String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = pa;
        this.rh = rh;
    }

    @Override
    public String getCobertura() {
        return "Cobertura internado de "+ obraSocial;
    }

    @Override
    public double getDescuento() {
        return 0.25;
    }

    @Override
    public String getVademecum() {
        return "Vademecum internado";
    }

    @Override
    public String getTipoDieta() {
        return "Dieta especial para internado";
    }

    @Override
    public String recetarRx() {
        return "Estudio Rx para internado";
    }

    @Override
    public String recetarSangre() {
        return "Estudio de sangre para internado";
    }
}
