/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;

/**
 *
 * @author Daniel
 */
public class Clientes {
    String nombre;
    double comision;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Clientes() {
    }

    public Clientes(String nombre, double comision) {
        this.nombre = nombre;
        this.comision = comision;
    }
}
