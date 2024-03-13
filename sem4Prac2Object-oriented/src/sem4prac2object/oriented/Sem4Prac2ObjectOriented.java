/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem4prac2object.oriented;

import java.util.Scanner;

/**
 *
 * @author Tang Chun Xuan
 */
//when q3,need to rename as public class unitConveter
//when q4,need to rename as public class Average
public class Sem4Prac2ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //q3
        /*System.out.println("Inches\tCentimeter");
        for(int i=1;i<=10;i++)
        {
        System.out.printf(i + "\t%.2f\n", inchToCentimeter(i));
        }
        
        System.out.println("Centimeter\tInches");
        for(int i=5;i<=50;i+=5)
        {
        System.out.printf(i + "\t%.2f\n", centimeterToInch(i));
        }*/
        
        //q4
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter one integer:");
        int a=scanner.nextInt(); 
        System.out.println("Please enter one integer:");
        int b=scanner.nextInt();
        System.out.println("Please enter one integer:");
        int c=scanner.nextInt();
        
        System.out.printf("the average is %.2f\n", calculateAverage(a,b));
        System.out.printf("the average is %.2f\n", calculateAverage(a,b,c));
        
        System.out.println("Please enter one double value:");
        double d=scanner.nextDouble();
        System.out.println("Please enter one double value:");
        double e=scanner.nextDouble();
        System.out.println("Please enter one double value:");
        double f=scanner.nextDouble();
        
        System.out.printf("the average is %.2f\n", calculateAverage(d,e));
        System.out.printf("the average is %.2f\n", calculateAverage(d,e,f));
    }

    public static void Q1() {
        System.out.println("Number\tSquareRoot");
        for (int i = 0; i <= 20; i += 2) {
            System.out.printf(i + "\t%.4f\n", Math.sqrt(i));
        }
    }

    //q3
    public static double inchToCentimeter(double in) {

        return in * 2.54;

    }

    public static double centimeterToInch(double cm) {

        return cm/2.54;
    }

    //q4
    public static double calculateAverage(int a,int b){
        return (a+b)/2.0;
    }
    
    public static double calculateAverage(int a,int b,int c){
        return (a+b+c)/3.0;
    }
    
    public static double calculateAverage(double a,double b){
        return (a+b)/2.0;
    }
    
    public static double calculateAverage(double a,double b,double c){
        return (a+b+c)/3.0;
    }
}
