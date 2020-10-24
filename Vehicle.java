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
public class Vehicle {
    protected String typeVehicle = "";
    public void test()
    {
        System.out.println("its motorcycle!");
    }
    
    public Vehicle(String tVehicle)
    {
        this.typeVehicle=tVehicle;
    }
    
    public void setTypeVehicle(String tVehicle)
    {
        this.typeVehicle=tVehicle;
    }
    
    public String getTypeVehicle()
    {
        return this.typeVehicle;
    }
    public String toString()
    {
        return "the name of"+getTypeVehicle();
    }
}
