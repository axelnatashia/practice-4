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
abstract class laptop {
    public abstract void merklaptop();
    
    public void warnalaptop()
    {
        System.out.println("ini laptopnya warna hitam");
    }
}


class Asus extends laptop
{
    public void merklaptop()
    {
        System.out.println("ini laptop merk ASUS");
    }
}

class MainClass{
    public static void main(String[] args)
    {
       Asus myAsus=new Asus();
       myAsus.merklaptop();
       myAsus.warnalaptop();
    }
}