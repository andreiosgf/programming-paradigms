/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andreiosgf.listgeneric;

import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class ListGeneric {

    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        System.out.println("Tamaño -> "+lista.size());
        
        lista.add("Cadena");
        lista.add(2);
        lista.add(3.2);
        
        System.out.println("Tamaño -> "+lista.size());
        
        for(Object objeto:lista)
        {
            if(objeto instanceof Integer)
            {
                int x=(Integer)objeto;
                System.out.println("Valor -> "+x);
            }else if(objeto instanceof String)
            {
                String cad=(String)objeto;
                System.out.println("Valor -> "+cad);
            }else
            {
                
            }
        }
    }
}
