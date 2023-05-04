/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejemploarreglos;

/**
 *
 * @author andre
 */
public class Arreglos {
   double[] arreglo;
   public Arreglos(int n)
   {
       arreglo=new double[n];
   }
   
   public void llenarArreglo()
   {
       for(int i=0;i<arreglo.length;i++)
       {
           arreglo[i]=Math.random();
       }
   }
   
   public void imprimirArreglo()
   {
       for(double x:arreglo)
       {
           System.out.println("Elemento - > "+x);
       }
   }
   
   public double[] devolverArreglo()
   {
       return arreglo;
   }
           
}
