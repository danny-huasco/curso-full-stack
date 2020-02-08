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
       
    public void resumen(){
        int contT = 0;
        int contA = 0;
        int contV = 0;
        
        if(lista.isEmpty()){                    //en caso de no haber instancias, se informa por pantalla
            System.out.println("No hay animales en el zoo");
        }else{        
            for(int i=0; i<lista.size();i++){   //se utilizan contadores para cada tipo
                if (lista.get(i) instanceof Terrestre){
                    contT++;
                }
                if (lista.get(i) instanceof Acuatico){
                    contA++;
                }
                if (lista.get(i) instanceof Voladores){
                    contV++;
                }
            }
            //se da el resultado por pantalla
            System.out.println("Dentro del zoologico se encuentran");
            System.out.println("Animales terrestres: " + contT + "\nAnimales Acuaticos: " + contA + "\nAnimales Voladores: " + contV);
        }
    }
    
    public void mostrarAnimales(){
        Scanner lctr = new Scanner(System.in);
        int c;
        if(lista.isEmpty()){                    //en caso de no haber instancias, se informa por pantalla
            System.out.println("No hay animales en el zoo");
        }else{
            do{              //bucle utilizado para mantener el menu activo en caso de input incorrectos
                System.out.println("que tipo de animal desea revisar? \n1. Terrestres \n2. Acuaticos \n3. Voladores");
                 c = lctr.nextInt();

                switch(c){
                    case 1:     //se recorre la lista de animales usando instanceof para diferenciar por tipo de animal
                        for(int i=0; i<lista.size();i++){
                            if (lista.get(i) instanceof Terrestre){
                                lista.get(i).toString();
                            }
                        }
                        break;
                    case 2:
                        for(int i=0; i<lista.size();i++){
                            if (lista.get(i) instanceof Acuatico){
                                lista.get(i).toString();
                            }
                        }
                        break;
                    case 3:
                        for(int i=0; i<lista.size();i++){
                            if (lista.get(i) instanceof Voladores){
                                lista.get(i).toString();
                            }
                        }
                        break;
                    default:
                        System.out.println("ingrese una opción correcta");
                        break;
                }               //condicion de quiebre del bucle
            }while(c!=1 && c!=2 && c!=3);
        }
    }
    
 
    public void añadirAnimal(Animal a){
        Scanner lee = new Scanner(System.in);
                            
        System.out.println("\n Qué tipo de animal desea ingresar? (1.terrestre, 2.acuatico, 3.volador)");
        int tipo = lee.nextInt();
            switch(tipo){
                case 1:     //se pide input por cada atributo de la instancia
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
                    break;
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
                    //se valida ingreso de valores limitados para el atributo "agresividad"
                    System.out.print("Agresividad: ");
                     byte br;
                    do{    
                         br = lee.nextByte();
                        if(br!=1 && br!=2 && br!=3){
                            System.out.println("valor erroneo, use numeros enteros entre 1 y 3.");
                        }else{
                            anA.setAgresividad(br);
                        }
                    }while(br!=1 && br!=2 && br!=3);
                    
                    System.out.print("cantidad de aletas");
                    anA.setCantAletas(lee.nextInt());
                    lista.add(anA);
                    break;
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
                    //asigna booleano según respuesta en String
                    System.out.print("es migrante? (s/n): ");
                    String opc;
                    do{
                        opc = lee.next();
                        if(opc!="s" && opc!="n"){
                            System.out.println("ingrese una opción valida (s/n)");
                        }else{
                            if(opc.equals("s") || opc.equals("S")){
                                anV.setMigrante(true);
                            }else{
                                anV.setMigrante(false);
                            }                                
                        }
                    }while(opc!="s" && opc!="n");
                    break;
                default:
                    System.out.println("opción incorrecta");
                    break;
            }        
    }    
    
}
