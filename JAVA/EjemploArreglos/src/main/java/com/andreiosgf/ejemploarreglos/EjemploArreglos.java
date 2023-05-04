/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andreiosgf.ejemploarreglos;

/**
 *
 * @author andre
 */
public class EjemploArreglos {

    public static void main(String[] args) {
        Arreglos arre=new Arreglos(5);
        arre.imprimirArreglo();
        arre.llenarArreglo();
        System.out.println("");
        arre.imprimirArreglo();
        
        double[] array=arre.devolverArreglo();
        System.out.println("");
        
        for(double x:array)
        {
            System.out.println("Elem -> "+x);
        }
        
        double[][] array2=new double[2][];
        array2[0]=new double[3];
        array2[1]=new double[5];
        
    }
}
