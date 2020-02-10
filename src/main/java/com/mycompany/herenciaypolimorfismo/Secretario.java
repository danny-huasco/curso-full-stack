/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;

/**
 *
 * @author Alumno
 */
public abstract class Secretario extends Empleado implements Interface {
    int despacho;
    String fax;
//incrementar salario 5% anual
    public Secretario(int despacho, String fax, String nombre, String apellidos, String DNI, String direccion, String telefono, long salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    public Secretario() {
        super();
        this.despacho = 0;
        this.fax = null;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public void imprimir(){
       System.out.println(super.toString() + "\n puesto: Secretario"); 
    }

  
}
