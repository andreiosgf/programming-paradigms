/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andreiosgf.ejpolimorfismo2;

/**
 *
 * @author andre
 */
public class EjPolimorfismo2 {

    public static void main(String[] args) {
        Pais p;
        
        //p=new Pais();
        
        p=new Mexico("Estados Unidos Mexicanos",128000000,"Español");
        System.out.println("Nombre -> "+p.getNombre());
        System.out.println("Nombre -> "+p.getPoblacion());
        System.out.println("Nombre -> "+p.getIdioma());
        System.out.println("");
        p=new USA("United States of America",350000000,"English");
        System.out.println("Nombre -> "+p.getNombre());
        System.out.println("Nombre -> "+p.getPoblacion());
        System.out.println("Nombre -> "+p.getIdioma());
    }
}
