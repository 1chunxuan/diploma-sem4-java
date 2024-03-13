/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4q4object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class CarType {
    private String make;
    private String model;
    private double capacity;
    
    public CarType(String make,String model,double capacity){
        this.make=make;
        this.model=model;
        this.capacity=capacity;
    }
    
    public String toString(){
        return "\t " + make +
               "\t " + model +
               "\t " + capacity;

        }
}
