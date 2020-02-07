/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoologicotangamandapio;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Zoologico {
    ArrayList<Animal> lista = new ArrayList<Animal>();
    
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int opc;
        
        System.out.println("*** Escoja una opción ***");
        System.out.println("1.- Añadir Animal \n2.- Mostrar animales \n3.- Resumen \n4.- Salir");
        opc = lector.nextInt();
        do{
           if(opc!=1 && opc!=2 && opc!=3 && opc!=4){
               System.out.println("Opción incorrecta \n intentelo de nuevo");
           }else{
               switch(opc){
                   case 1:
                       Animal nuevo = new Animal();
                       
               }
           } 
        }while(opc!=1 && opc!=2 && opc!=3 && opc!=4);
    }
       
 
    public void añadirAnimal(Animal a){
        Scanner lee = new Scanner(System.in);
             
        System.out.println("ingrese los siguientes atributos:");
        
        System.out.print("\n Nombre: ");
        a.setNombre(lee.next());
        
        System.out.print("\n Pais de origen: ");
        a.setPais(lee.next());
        
        System.out.print("\n fecha de ingreso: ");
        a.setFechaIngreso(lee.next());
      
        System.out.println("\n Qué tipo de animal desea ingresar? (1.terrestre, 2.acuatico, 3.volador)");
        int tipo = lee.nextInt();
            switch(tipo){
                case 1:
                    Terrestre an = new Terrestre();
                    System.out.println("ingrese los siguientes atributos:");
                    
                    System.out.print("Cantidad de patas: ");
                    an.setCantPatas(lee.nextInt());
                    
                    System.out.print("Tipo de alimentación: ");
                    an.setTipoAlimentacion(lee.next());
                    
                    System.out.print("Horas de sueño: ");
                    an.setHorasSueño(lee.nextInt());
                    
                case 2:
                    
                case 3:

                default:
                    System.out.println("ingrese una opción correcta");

            }        
    }    
    
}
