/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.afloriano.holamundo;

/**
 *
 * @author andre
 */
public class HolaMundo {

    String name;
    int times;
    
    public HolaMundo(String nm,int tm){
        name=nm;
        times=tm;
    }
    
    @Override
    public String toString(){
        return name+" "+times;
    }
    
    public void printGreet(){
        for(int i=0;i<times;i++){
            System.out.println("Hola "+name);
        }
    }
    
    public static void main(String[] args) {
        HolaMundo hm=new HolaMundo("Andres",3);
        System.out.println(hm);
        hm.printGreet();
        
    }
}
