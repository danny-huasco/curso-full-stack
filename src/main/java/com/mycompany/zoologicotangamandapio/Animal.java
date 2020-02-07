/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoologicotangamandapio;

/**
 *
 * @author Alumno
 */
public class Animal {
    private String nombre;
    private String pais;
    private String fechaIngreso;

    public Animal(String nombre, String pais, String fechaIngreso) {
        this.nombre = nombre;
        this.pais = pais;
        this.fechaIngreso = fechaIngreso;
    }

    public Animal() {
        this.nombre = "";
        this.pais = "";
        this.fechaIngreso = "";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", pais=" + pais + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
