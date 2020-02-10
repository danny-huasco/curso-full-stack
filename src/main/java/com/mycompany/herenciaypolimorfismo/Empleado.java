/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;
import java.util.Date;
/**
 *
 * @author Alumno
 */
public class Empleado {
    Date ingreso = new Date();//buscar automatizacion del paso de un año desde que entró a trabajar
    
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int años_ant;
    private String telefono;
    private long salario;
    Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, long salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAños_ant() {
        return años_ant;
    }

    public void setAños_ant(int años_ant) {
        this.años_ant = años_ant;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + "\n apellidos=" + apellidos + "\n DNI=" + DNI + "\n direccion=" + direccion + "\n a\u00f1os_ant=" + años_ant + "\n telefono=" + telefono + "\n salario=" + salario + "\n supervisor=" + supervisor ;
    }
    
    
    //aumenta slario en base a cantidad de dinero
    public void incrementarSalario(long num){
        this.salario = this.salario + num;
    }
    
    //aumenta salario en base a porcentaje
    public void aumentoSalario(int num){
        long porcentaje;
        
        porcentaje = ((this.salario*num)/100);
        this.salario = this.salario + porcentaje;
    }
    
    public void cambiarSupervisor(Empleado e){
        this.supervisor = e;
    }
}
