/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4q4object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class Car {
    private String plateNo;
    private String color;
    private String year;
    private CarType carType;
    
    public Car(String plateNo,String color,String year,CarType carType){
        this.plateNo=plateNo;
        this.color=color;
        this.year=year;
        this.carType=carType;
    }
    
    public String toString()
    {
        return "\t"+plateNo+
                "\t"+color+
                "\t"+year+
                "\t"+carType.toString();
    }
}