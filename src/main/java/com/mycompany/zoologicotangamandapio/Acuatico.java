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
public class Acuatico extends Animal{
    String tipoAmbiente;
    int cantAletas;
    byte agresividad;

    public Acuatico() {
        super();
        this.agresividad = 0;
        this.cantAletas = 0;
        this.tipoAmbiente = "";
    }

    public Acuatico(String tipoAmbiente, int cantAletas, byte agresividad, String nombre, String pais, String fechaIngreso) {
        super(nombre, pais, fechaIngreso);
        this.tipoAmbiente = tipoAmbiente;
        this.cantAletas = cantAletas;
        this.agresividad = agresividad;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public int getCantAletas() {
        return cantAletas;
    }

    public void setCantAletas(int cantAletas) {
        this.cantAletas = cantAletas;
    }

    public byte getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(byte agresividad) {
        this.agresividad = agresividad;
    }
    

    @Override
    public String toString() {
        return "Acuatico{" + "tipoAmbiente=" + tipoAmbiente + ", cantAletas=" + cantAletas + ", agresividad=" + agresividad + super.toString() + '}';
    }
    
    
    
    
}
