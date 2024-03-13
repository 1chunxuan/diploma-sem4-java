/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem4.prac1.object.oriented;

import java.util.Scanner;

/**
 *
 * @author Tang Chun Xuan
 */
public class Sem4Prac1ObjectOriented2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Q3();
    }
    
    public static void Q1(){
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter your year of study:");
        int yrOfStudy=scanner.nextInt();
        
        System.out.println("what is your target GPA for this semester?");
        double gpa=scanner.nextDouble();
        
        System.out.println("Welcome "+ name + "!");
        System.out.println("Work hard to achieve your target GPA of " + gpa + " this semester of your Year" + yrOfStudy +".");
    }
   
    public static void Q2(){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter your age(years):");
        int age=scanner.nextInt();
        
        System.out.println("Age in years:" + age +"years");
        System.out.println("Age in days:" + age*365 + "days");
        System.out.println("Age in seconds:" + age*365*24*60*60 +"seconds");
    }
    
    public static void Q3(){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Please enter the credit card number:");
        int cardNumber=scanner.nextInt();
        
        /*int num1,num2,num3,num4;*/
        int temp1=cardNumber;
        int sum,sum1=0,sum2=0;
        for(int i=1;i<=4;i++)
        {
            sum1+=temp1%10;
            //sum1=sum1+(temp1%10)
            //eg:43589795%10=5
            temp1/=100;//temp1=temp/100
            /*num1=temp1%10; 
            num2=temp1%100%10;
            num3=temp1%10000%10;
            num4=temp1%1000000%10;
            
            sum=num1+num2+num3+num4;*/
        }
        
        int temp2 = cardNumber/10;
        int digits = 0,digit1,digit2;
        for(int i=1;i<=4;i++)
        {
            digits = temp2%10*2;
            temp2/=100;
            digit1=digits%10;
            digit2=digits/10;
            
            sum2+=digit1+digit2;
        }
        
        sum=sum1+sum2;
        
        if(sum%10==0)
        {
            System.out.println("This card number is valid.");
        }
        else
        {
            System.out.println("This card number is not valid.");
        }
    }
}
