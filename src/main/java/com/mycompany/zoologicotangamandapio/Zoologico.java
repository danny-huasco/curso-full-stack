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
    ArrayList<Animal> lista = new ArrayList<>();
    
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int opc;
        do{
        System.out.println("*** Escoja una opción ***");
        System.out.println("1.- Añadir Animal \n2.- Mostrar animales \n3.- Resumen \n4.- Salir");
        opc = lector.nextInt();
        
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
       
    public void mostrarAnimales(){
        
    }
    
 
    public void añadirAnimal(Animal a){
        Scanner lee = new Scanner(System.in);
             
        System.out.println("\n Qué tipo de animal desea ingresar? (1.terrestre, 2.acuatico, 3.volador)");
        int tipo = lee.nextInt();
            switch(tipo){
                case 1:
                    Terrestre anT = new Terrestre();
                    System.out.println("ingrese los siguientes atributos:");
                    
                    System.out.print("\n Nombre: ");
                    anT.setNombre(lee.next());
        
                    System.out.print("\n Pais de origen: ");
                    anT.setPais(lee.next());

                    System.out.print("\n fecha de ingreso: ");
                    anT.setFechaIngreso(lee.next());

                    System.out.print("Cantidad de patas: ");
                    anT.setCantPatas(lee.nextInt());
                    
                    System.out.print("Tipo de alimentación: ");
                    anT.setTipoAlimentacion(lee.next());
                    
                    System.out.print("Horas de sueño: ");
                    anT.setHorasSueño(lee.nextInt());
                    lista.add(anT);
                    
                case 2:
                    Acuatico anA = new Acuatico();
                    System.out.println("ingrese los siguientes atributos:");
                    
                    System.out.print("\n Nombre: ");
                    anA.setNombre(lee.next());
        
                    System.out.print("\n Pais de origen: ");
                    anA.setPais(lee.next());
        
                    System.out.print("\n fecha de ingreso: ");
                    anA.setFechaIngreso(lee.next());

                    System.out.print("Agua dulce o salada?: ");
                    anA.setTipoAmbiente(lee.next());
                    //validar ingreso de valores limitados
                    System.out.print("Agresividad: ");
                    anA.setAgresividad(lee.nextByte());
                    
                    System.out.print("cantidad de aletas");
                    anA.setCantAletas(lee.nextInt());
                    lista.add(anA);
                    
                case 3:
                    Voladores anV = new Voladores();
                    System.out.println("ingrese los siguientes atributos:");
                    
                    System.out.print("\n Nombre: ");
                    anV.setNombre(lee.next());
        
                    System.out.print("\n Pais de origen: ");
                    anV.setPais(lee.next());

                    System.out.print("\n fecha de ingreso: ");
                    anV.setFechaIngreso(lee.next());

                    System.out.print("color de plumas: ");
                    anV.setColorPlumas(lee.next());
                    
                    System.out.print("tamaño (sea descriptivo): ");
                    anV.setTamaño(lee.next());
                    //asignar booleano según respuesta
                    System.out.print("es migrante? (s/n): ");
                    String opc = lee.next();
                    
                default:
                    System.out.println("ingrese una opción correcta");

            }        
    }    
    
}
