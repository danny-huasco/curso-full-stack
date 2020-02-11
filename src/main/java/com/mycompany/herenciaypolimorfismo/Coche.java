/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;
import java.io.*;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Coche {
    String matricula;
    String marca;
    String modelo;
    boolean libre; //definirá los autos usables dentro del arraylist en clase principal
                    //true para disponible, false para ocupado

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void cargarArchivo(){
        StringTokenizer st = new StringTokenizer(""); //para separar cada palabra
        
       // BufferedReader br = new BufferedReader(new FileReader("autos.txt"));
       // String linea = br.readLine();
        /* declarar exepcion con throw, try, catch y finally.
        * crear archivo para lectura
        * crear metodo de creacion/escritura cuando el programa cierra
        * mover este metodo a la clase principal        
        */
    }
    
    public void escribirArchivo(){
        File archivo = new File("autos.txt");
        
       //escribir archivo con lista de autos
       //mover a clase principal
       //ordenar archivo al escribir tal cual como se debe leer después
    }
}
