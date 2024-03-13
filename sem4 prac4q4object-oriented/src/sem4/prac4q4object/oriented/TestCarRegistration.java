/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4q4object.oriented;

import java.util.Scanner;
/**
 *
 * @author Tang Chun Xuan
 */
public class TestCarRegistration {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       CarType[] carTypeArr= { 
            new CarType("Toyota", "Vios", 1.5 ),
            new CarType("Nissan", "Teana", 1.5 ),
            new CarType("Honda", "City", 1.6 ),
        };
       
       Registration[] reg=new Registration[6];
       
       for(int i=0;i<reg.length;i++)
       {
           //owner information
           System.out.println("Owner name:");
           String name=scanner.nextLine();
           
           System.out.println("Owner ic:");
           String ic=scanner.nextLine();
           
           Owner owner=new Owner(ic,name);
           
           //car information
           System.out.println("Car plate no:");
           String plateNo=scanner.nextLine();
           System.out.println("Car color:");
           String color=scanner.nextLine();
           System.out.println("Car year:");
           String year=scanner.nextLine();
           
           //select car type
           System.out.println("\t Make \tModel \tCapacity");
           for(int j=0;j<carTypeArr.length;j++)
           {
               System.out.println((j+1)+"\t"+carTypeArr[j].toString());
           }
           System.out.println("Selection?");
           int selection=scanner.nextInt();
           scanner.nextLine();
           
           Car car=new Car(plateNo,color,year,carTypeArr[selection-1]);
           
           reg[i]=new Registration(owner,car);
           
       }
        System.out.println("\t\t Car registration");
            System.out.println("Reg No\t Name \t ic no \t plate no \tcar color\t car year ");
            for(int i=0;i<reg.length;i++)
            {
                System.out.println(reg[i].toString());
            }
    }
}
