/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice4;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author axel
 */
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        String codeV;
        String codeY;
        
        ArrayList<String> hicle =new ArrayList();
        HashMap<String, String> kendaraan = new HashMap();
        Scanner key = new Scanner(System.in);
       
        System.out.println("Please input type vehicle code ");
        name=key.nextLine();
         
        hicle.add(name);
        System.out.println("nama kendaraan : "+hicle);
        
        System.out.println("Please input the codeV: ");
        codeV=key.nextLine();
        
        System.out.println("Please input the codeY : ");
        codeY=key.nextLine();
        
        kendaraan.put(codeV, codeY);
        
        System.out.println("kode V "+codeV);
        System.out.println("kode Y "+codeY);
        
       
    }
    
}
