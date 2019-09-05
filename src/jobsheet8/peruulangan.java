/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class peruulangan {
    public static void main(String []args){
        
        //membuat variabel
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner mahal = new Scanner(System.in);
        
        while(running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak >" );
            
            jawab = mahal.nextLine();
            
            //cek jawabannya
            if(jawab.equalsIgnoreCase("ya")){
            running = false;
            
        }
            counter++;
        }
        System.out.println("anda sudah melakukan perulangan sebanyak" + counter + "kali");
        
    }
    
}
