/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejpolimorfismo;

/**
 *
 * @author andre
 */
public abstract class Pais {
    
    String nombre;
    
    public Pais(String nom)
    {
        nombre=nom;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public abstract int getPoblacion();
    public abstract String getIdioma();
    
    
}
