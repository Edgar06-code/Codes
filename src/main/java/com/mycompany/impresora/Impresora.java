/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impresora;

/**
 *
 * @author ASUS
 */
public class Impresora {

    public static void main(String[] args) {
        Imp_Base i1=new Imp_Base();
        i1.marca = "EPSON";
        i1.modelo = "L3210";
        i1.velocidad = 10;
        i1.estado = 0;
        
        i1.mostrarInfo();
        i1.encender();
        i1.imprimir();
        i1.apagar();
    }
}
