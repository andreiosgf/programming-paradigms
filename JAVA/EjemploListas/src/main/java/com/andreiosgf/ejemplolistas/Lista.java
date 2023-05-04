/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreiosgf.ejemplolistas;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class Lista {
    private ArrayList<Integer> lista;
    
    public Lista()
    {
        lista=new ArrayList<Integer>();
    }
    
    public void addValue(int x)
    {
        lista.add(x);
    }
    
    public Integer getValue(int i)
    {
        return lista.get(i);
    }
    
    public void removeValue(int i)
    {
        lista.remove(i);
    }
    
    public void printList()
    {
        for(Integer num:lista)
        {
            System.out.println("Element -> "+num);
        }
    }
}
