/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejpolimorfismo;

/**
 *
 * @author andre
 */
public class Mexico extends Pais{
    
    int poblacion;
    String idioma;
    
    public Mexico(String nombre,int pob,String id)
    {
        super(nombre);
        poblacion=pob;
        idioma=id;
    }
    
    @Override
    public int getPoblacion()
    {
       return poblacion; 
    }
    
    @Override
    public String getIdioma()
    {
       return idioma; 
    }
    
}
