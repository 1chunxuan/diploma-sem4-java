/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4prac7object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public abstract class PatientBill implements Comparable{
    protected int visitId;
    protected String name;
    protected static int lastAssignedID=1001;
    
    public PatientBill(String name){
        this.visitId=lastAssignedID;
        this.name=name;
        lastAssignedID++;
    }
    
    public abstract double calcTotalCharges();
    
    public int compareTo(Object o){
        PatientBill otherBill=(PatientBill)o;
        return name.compareTo(otherBill.name);
    }
        
    public String toString(){
        return
                "\nVisit ID : "+visitId+
                "\nVisit Name : "+name;
    }
}
