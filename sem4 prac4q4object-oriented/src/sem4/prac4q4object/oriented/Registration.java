/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4q4object.oriented;

import sem4.prac4q4object.oriented.Owner;
import sem4.prac4q4object.oriented.Car;

/**
 *
 * @author Tang Chun Xuan
 */
public class Registration {
    private int regNo;
    private Owner owner;
    private Car car;
    public static int nextRegNo=1000;
    
    public Registration(Owner owner,Car car){
        
        this.owner=owner;
        this.car=car;
        nextRegNo++;
        this.regNo=nextRegNo;
    }
    
    public String toString(){
        return "\t"+regNo +"\t" +owner.toString()+"\t"+car.toString();
    }
}
