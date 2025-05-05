/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pelota;

/**
 *
 * @author ASUS
 */
public class Pelota {

    public static void main(String[] args) {
        Pelota_Base p=new Pelota_Base();
        p.color="Roja";
        p.material="Caucho";
        p.tamanio=22;
        p.estado=0;
        
        p.mostrarDatos();
        p.rodar();
        p.mostrarDatos();
        p.detener();
        p.mostrarDatos();
    }
}
