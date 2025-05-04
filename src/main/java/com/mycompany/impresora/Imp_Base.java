/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impresora;

/**
 *
 * @author ASUS
 */
public class Imp_Base {
    String marca;
    String modelo;
    int velocidad;
    int estado; //1=encendidad,0=apagada


public void encender (){
    estado=1;
    System.out.println("Impresora encendida");
}

public void apagar (){
    estado=0;
    System.out.println("Impresora apagada");
}

public void imprimir(){
    if(estado==1){
        System.out.println("Imprimiendo");
    }
    else{
        System.out.println("No se puede imprimir,impresora apagada");
            }
    }

public void mostrarInfo(){
    System.out.println("Marca" + marca);
    System.out.println("Modelo" + modelo);
    System.out.println("Velocidad" + velocidad + "paginas por minuto");
    System.out.println("Estado" +(estado == 1? "Encendida": "Apagada"));
} 
}
    
