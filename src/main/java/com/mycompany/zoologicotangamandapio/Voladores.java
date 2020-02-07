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
public class Voladores extends Animal{
    String colorPlumas;
    String tamaño;
    boolean migrante;

    public Voladores() {
        super();
        this.colorPlumas = "";
        this.migrante = false;
        this.tamaño = "";
    }

    public Voladores(String colorPlumas, String tamaño, boolean migrante, String nombre, String pais, String fechaIngreso) {
        super(nombre, pais, fechaIngreso);
        this.colorPlumas = colorPlumas;
        this.tamaño = tamaño;
        this.migrante = migrante;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isMigrante() {
        return migrante;
    }

    public void setMigrante(boolean migrante) {
        this.migrante = migrante;
    }

    @Override
    public String toString() {
        return "Voladores{" + "colorPlumas=" + colorPlumas + ", tama\u00f1o=" + tamaño + ", migrante=" + migrante + super.toString() + '}';
    }

      
}
