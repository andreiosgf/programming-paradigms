/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andreiosgf.ejemplolistas;

/**
 *
 * @author andre
 */
public class EjemploListas {

    public static void main(String[] args) {
        Lista list=new Lista();
        list.addValue(3);
        list.addValue(-3);
        list.addValue(2);
        list.addValue(4);
        list.addValue(7);
        
        list.printList();
        
        list.removeValue(2);
        
        System.out.println("");
        list.printList();
        
        
    }
}
