/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sanatorio;

import com.mycompany.sanatorio.Departamentos.ClinicaMedica;

/**
 *
 * @author valentino
 */
public class Adulto extends Paciente implements ClinicaMedica {
    private double presionArterial;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, double pa, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = pa;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getCobertura() {
        return "Cobertura adulta de " + obraSocial;
    }

    @Override
    public double getDescuento() {
        return 0.15;
    }

    @Override
    public String getVademecum() {
        return "Vademecum adulto";
    }

    @Override
    public String recetarRx() {
        return "Estudio Rx para adulto";
    }

    @Override
    public String recetarSangre() {
        return "Estudio de sangre para adulto";
    }
}
