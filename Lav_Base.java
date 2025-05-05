/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavadora;

/**
 *
 * @author ASUS
 */
public class Lav_Base{
    String marca;
    String modelo;
    int capacidad;
    int estado;

public void encender (){
    estado=1;
    System.out.println("Lavadora encendida");
}

public void apagar (){
    estado=0;
    System.out.println("Lavadora apagada");
}

public void lavar(){
    if(estado==1){
        System.out.println("Lavando ropa");
    }
    else{
        System.out.println("Lavadora apagada");
            }
    }

public void mostrarInfo(){
    System.out.println("Marca" + marca);
    System.out.println("Modelo" + modelo);
    System.out.println("Capacidad" + capacidad + "kg");
    System.out.println("Estado" +(estado == 1? "Encendida": "Apagada"));
} 
}
    

