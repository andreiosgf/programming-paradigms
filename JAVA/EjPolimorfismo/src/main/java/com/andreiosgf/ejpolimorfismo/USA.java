/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejpolimorfismo;

/**
 *
 * @author andre
 */
public class USA extends Pais{
    int poblacion;
    String idioma;
    
    public USA(String nombre,int pob,String id)
    {
        super(nombre);
        poblacion=pob;
        idioma=id;
    }
    
    @Override
    public int getPoblacion()
    {
        System.out.println("Poblacion -> "+poblacion);
        return poblacion; 
    }
    
    @Override
    public String getIdioma()
    {
       return idioma; 
    }
    
}
