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
public class MotorCycle extends Vehicle {
    private String namemCycle;
    private int codemCycle;
    
    public MotorCycle(String mCycle, int coCycle, String vehicle)
    {
        super(vehicle);
        this.namemCycle=mCycle;
        this.codemCycle=coCycle;
    }
    
    public void setNameMCycle(String mCycle)
    {
        this.namemCycle=mCycle;
    }
    
    public void setCodeMCycle(int coCycle)
    {
        this.codemCycle=coCycle;
    }
    
    public String getNameMCycle()
    {
        return this.namemCycle;
    }
    
    public int getCodeMCycle()
    {
        return this.codemCycle;
    }
    
    public String toString()
    {
        return "the name of"+getTypeVehicle()+ "with a name "+getNameMCycle()+"with code "+getCodeMCycle();
    }
}
