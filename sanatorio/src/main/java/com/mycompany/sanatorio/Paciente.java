/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sanatorio;

import com.mycompany.sanatorio.Departamentos.Administracion;

/**
 *
 * @author valentino
 */
public abstract class Paciente implements Administracion {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public abstract String getCobertura();
    public abstract double getDescuento();
    public abstract String getVademecum();
}
