/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejpolimorfismo2;

/**
 *
 * @author andre
 */
public class Mexico implements Pais{
    String nombre;
    int poblacion;
    String idioma;
    public Mexico(String nombre,int pob,String id)
    {
        this.nombre=nombre;
        poblacion=pob;
        idioma=id;
    }
    
    
    @Override
    public String getNombre()
    {
        return nombre;
    }
    
    public int getPoblacion()
    {
        return poblacion;
    }
    
    public String getIdioma()
    {
        return idioma;
    }
}
