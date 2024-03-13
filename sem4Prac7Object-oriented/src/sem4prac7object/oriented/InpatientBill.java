/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4prac7object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class InpatientBill extends PatientBill{

    private static double standardRate=100;
    private static double privateRate=200;
    private double specialistCharges;
    private double labCharges;
    private String roomType;
    private int durationOfStay;
    
    public InpatientBill(String name,double specialistCharges,double labCharges,String roomType,int durationOfStay){
        super(name);
        this.specialistCharges=specialistCharges;
        this.labCharges=labCharges;
        this.roomType=roomType;
        this.durationOfStay=durationOfStay;
    }
    
    @Override
    public double calcTotalCharges() {
        double roomCharges=0;
        
        if(roomType.equals("S")){
            roomCharges=durationOfStay*standardRate;         
        }
        else{
            roomCharges=durationOfStay*privateRate;
        }
        
        return specialistCharges+labCharges+roomCharges;
            
    }
    public String toString(){
        return
                super.toString()+
                "\nSpecialist Charges : "+specialistCharges+
                "\nLab Charges : " +labCharges+
                "\nRoom Type : "+roomType+
                "\nDuration of Stay : "+durationOfStay;
    }
}
