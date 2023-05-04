/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andreiosgf.encapsulamiento;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Introduce X ");
        x=sc.nextInt();
        System.out.println("Introduce Y ");
        y=sc.nextInt();
        
        Calculadora c=new Calculadora(x,y);
        
        System.out.println("X= "+c.getX());
        
       // c.x=10;
       // c.y=-5;
        
        
    }
}
