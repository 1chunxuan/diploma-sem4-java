/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4assignmentjava;
import java.util.Scanner;
/**
 *
 * @author Tang Chun Xuan
 */


public class purchase {
          Customer customer=new Customer();
      static  Customer[] customers=new Customer[100];
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        customers[0]=new Customer("aaa","line123","22222");
        String reply;
        System.out.println("Enter the name:");
        reply=scanner.nextLine();
        checkStatus(reply);
    }
    
    
    public static void checkStatus(String reply){
        for(int i=0;i<customers.length;i++){
              if(reply!=customers[i].getCustName())
              {
                  System.out.println("Please register as customer first:");
              }
        }

    }
}



