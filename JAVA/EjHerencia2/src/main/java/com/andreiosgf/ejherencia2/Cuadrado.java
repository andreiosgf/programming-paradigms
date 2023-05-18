/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejherencia2;

/**
 *
 * @author andre
 */
public class Cuadrado extends Cuadrilatero{
    
    int lado;
    
    public Cuadrado(int l)
    {
        super(l,l,l,l);
        lado=l;
    }
    
    public int area()
    {
        return lado*lado;
    }
    
    public int perimetroC()
    {
        return super.perimetro();
    }
    
    
}
