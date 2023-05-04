/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.encapsulamiento;

/**
 *
 * @author andre
 */
public class Calculadora {
    private int x;
    private int y;
    
    public Calculadora(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public void setX(int x)
    {
        this.x=x;
    }
}
