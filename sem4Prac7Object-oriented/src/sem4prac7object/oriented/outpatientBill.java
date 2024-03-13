/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4prac7object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class outpatientBill extends PatientBill{

    private static double registrationFee=30;
    private double consultationFee;
    
    public outpatientBill(String name, double consultationFee){
        super(name);
        this.consultationFee=consultationFee;
    }
    
    @Override
    public double calcTotalCharges() {
        return registrationFee+consultationFee;
    }
    
    public String toString(){
        return 
                super.toString()+
                "\n Registration Fee : "+registrationFee+
                "\nConsulation Fee : "+consultationFee;
    }
    
}
