/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice4;

/**
 *
 * @author axel
 */
interface Buah {
    public void namaBuah();
    
    public void warnaBuah();
}

class BuahLokal implements Buah
{
    public void namaBuah()
    {
        System.out.println("ini adalah buah.... ");
    }
    
    public void warnaBuah()
    {
        System.out.println("buah warnanya...");
    }
}

class MyMainClass{
    public static void main(String[] args)
    {
        BuahLokal myLokal = new BuahLokal();
        myLokal.namaBuah();
        myLokal.warnaBuah();
    }
}