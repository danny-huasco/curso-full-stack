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
public class Terrestre extends Animal{
    int cantPatas;
    String tipoAlimentacion;
    int horasSueño;

    public Terrestre(int cantPatas, String tipoAlimentacion, int horasSueño, String nombre, String pais, String fechaIngreso) {
        super(nombre, pais, fechaIngreso);
        this.cantPatas = cantPatas;
        this.tipoAlimentacion = tipoAlimentacion;
        this.horasSueño = horasSueño;
    }

    public Terrestre() {
        super();
        this.cantPatas = 0;
        this.horasSueño = 0;
        this.tipoAlimentacion = "";
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getHorasSueño() {
        return horasSueño;
    }

    public void setHorasSueño(int horasSueño) {
        this.horasSueño = horasSueño;
    }

    @Override
    public String toString() {
        return "Terrestre{" + "cantPatas=" + cantPatas + ", tipoAlimentacion=" + tipoAlimentacion + ", horasSue\u00f1o=" + horasSueño + super.toString() + '}';
    }
  
    
}
