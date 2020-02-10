/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public abstract class Vendedor extends Empleado implements Interface{
    Coche c;
    int area;
    ArrayList<Clientes> lista = new ArrayList<>();
   
    //aumenta salario 10% anual
    
     public Vendedor(){
         super();
         this.c = null;
         this.area = 0;
         this.lista = null;
         this.supervisor = null;
    } 

    public Vendedor(Coche c, int area, String nombre, String apellidos, String DNI, String direccion, String telefono, long salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.c = c;
        this.area = area;
    }

    
    @Override
    public void imprimir() {
        System.out.println(super.toString() + "\n puesto: Vendedor");
    }
    
    @Override
    public void darDeAlta(){
        Scanner reader = new Scanner(System.in);
        Clientes cliente = new Clientes();
        
        System.out.println("Ingrese los datos del nuevo cliente");
        System.out.print("nombre: ");
        cliente.setNombre(reader.next());
        
        System.out.print("porcentaje de comision: ");
        cliente.setComision(reader.nextDouble());
        
        lista.add(cliente);
    }
    
    @Override
    public void darDeBaja(){
        Scanner reader = new Scanner(System.in);
        String aux;
        
        System.out.print("ingrese el nombre del cliente a dar de baja: ");
        aux = reader.next();
        
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getNombre().equals(aux)){
                lista.remove(i);
                System.out.println("eliminacion exitosa");
                break;
            }
        }
        
    }
    //idear manera de manejar un array de coches disponibles para uso del personal
    public void cambiarCoche(Coche c){
        this.c = c;
    }
}
