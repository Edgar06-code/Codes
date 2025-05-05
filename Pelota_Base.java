/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pelota;

/**
 *
 * @author ASUS
 */
public class Pelota_Base {
    String color;
    String material;
    int tamanio;
    int estado;
    
    public void rodar(){
        estado=1;
        System.out.println("La pelota esta rodando");
    }
    
    public void detener(){
        estado=0;
        System.out.println("La pelota esta detenida");
    }
    
    public void mostrarDatos(){
    System.out.println("Color" + color);
    System.out.println("Material" + material);
    System.out.println("Tamanio" + tamanio + "cm");
    System.out.println("Estado" +(estado == 1? "En movimiento": "Detenida"));
}   
}
