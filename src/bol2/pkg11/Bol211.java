/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg11;

import java.util.Scanner;

/**
 *
 * @author Pablite5
 */
public class Bol211 {


  
    public static void main(String[] args) {
        
        
         float sueldo,ventas,km,sueldobruto;
        int dias;
        
        System.out.print("Sueldo: ");
            Scanner obx=new Scanner(System.in);
            sueldo=obx.nextFloat();
            
        System.out.print("Ventas: ");
            ventas=obx.nextFloat();            
        
        System.out.print("Km recorridos : ");
            km=obx.nextFloat();
                    
        System.out.print("Dias de desplazamiento : ");
            dias=obx.nextInt();
        
            sueldobruto=(float) ((ventas*0.05)+(km*2)+sueldo+(dias*30));
            
        System.out.println("Sueldo bruto : "+sueldobruto);
       
    }
    
}   