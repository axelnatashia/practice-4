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
public class Cycle extends Vehicle {
    private String name="";
    private int codecycle=0;
    
    
    
    public Cycle(String nCycle, int cCycle, String tVehicle)
    {
        super(tVehicle);
        this.name = nCycle;
        this.codecycle= cCycle;
    }
    
    public void setName(String nCycle)
    {
        this.name = nCycle;
    }
    
    public void setCodeCycle(int cCycle)
    {
        this.codecycle=cCycle;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getCodeCycle()
    {
        return this.codecycle;
    }
    
    public String toString()
    {
        return "the name of"+getTypeVehicle()+"has a type name is "+getName()+"that have a code "+getCodeCycle();
    }
}
