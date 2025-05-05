/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lavadora;

/**
 *
 * @author ASUS
 */
public class Lavadora {

    public static void main(String[] args) {
        Lav_Base lav=new Lav_Base();
        lav.marca = "LG";
        lav.modelo = "Turbo";
        lav.capacidad = 8;
        lav.estado = 0;
        
        lav.mostrarInfo();
        lav.encender();
        lav.lavar();
        lav.apagar();
    }
}
