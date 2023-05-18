/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejherencia2;

/**
 *
 * @author andre
 */
public class Cuadrilatero {
    
    int lado1;
    int lado2;
    int lado3;
    int lado4;
    
    public Cuadrilatero(int l1,int l2,int l3,int l4)
    {
        lado1=l1;
        lado2=l2;
        lado3=l3;
        lado4=l4;
    }
    
    public void setLado1(int l1)
    {
        lado1=l1;
    }
    
    public int getLado1()
    {
        return lado1;
    }
    
    public int perimetro()
    {
        return lado1+lado2+lado3+lado4;
    }
    
}
