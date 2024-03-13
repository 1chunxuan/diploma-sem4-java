/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4assignmentjava;

/**
 *
 * @author Tang Chun Xuan
 */
public class Customer {
    private int custId;
    private String custName;
    private String address;
    private String phoneNumber;
    static int lastCustId=1;
    
    public Customer(){
    
     }
    
    public Customer(String custName,String address,String phoneNumber){
        this.custId=lastCustId;
        this.custName=custName;
        this.address=address;
        this.phoneNumber=phoneNumber;
        lastCustId++;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public static boolean  validateCustName(String name){
  
        boolean validate1=true;
        
        for(int i=0;i<name.length();i++){
            if(Character.isDigit(name.charAt(i)))
                validate1= false;
            else
                validate1=true;
        }
    
        return validate1;
    }
    
    public static boolean  validatephoneNum(String pNumber){
    boolean validate2=true;
    
    for(int i=0;i<pNumber.length();i++){
        if(Character.isLetter(pNumber.charAt(i))){
            validate2= false;
        }
        else{
            validate2= true;
        }
        }
        return validate2;
    }
    
    public static boolean validateCustAddr(String address){
    
        boolean validate3=true;
        
      for(int i=0;i<address.length();i++){
            if(Character.isDigit(address.charAt(i)))
                validate3= false;
        }
    return validate3;
    }
    
}
