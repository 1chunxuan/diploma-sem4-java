/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem4.prac3object.oriented;

import java.util.Scanner;
/**
 *
 * @author Tang Chun Xuan
 */
public class Sem4Prac3objectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*//q3
        Scanner scanner=new Scanner(System.in);
        int[] denomination={100,50,20,10,5,1};
        int[] qty=new int[denomination.length];
        System.out.println("Denomination(RM)\tQuantity");
        for(int i=0;i<denomination.length;i++)
        {
            System.out.println(denomination[i]+"\t");
            qty[i]=scanner.nextInt();
        }
        int total=0;
        System.out.println("Denomination(RM)\tQuantity\tValue(RM)");
        for(int i=0;i<denomination.length;i++)
        {
            System.out.println(denomination[i]+"\t"+qty[i]+"\t");
            total+=denomination[i]*qty[i];
        }
        System.out.println("Total = RM "+total);*/
        
         /*//q1
    Scanner scanner=new Scanner(System.in);
    
    int a,sum=0,b=0,c=0;
    int[] score;
    
    double avrg;
    System.out.println("Enter number of quiz scores to process:");
    a=scanner.nextInt();
    score=new int[a];
    
    for(int i=0;i<a;i++)
    {
        System.out.println("Score"+(i+1)+":");
        score[i]=scanner.nextInt();
        sum+=score[i];
    }
    avrg=(double)sum/a;
    for(int i=0;i<a;i++)
    {
        if(avrg>score[i])
            b++;
        else
            c++;
    }
    System.out.println("Results");
    System.out.println("=======");
    System.out.println("Average is "+ avrg);
    System.out.println("Number of scores above or equal to the average is "+c);
    System.out.println("Number of scores below the average is "+b);*/
         
         /*//q2
         int [] list={1,2,4,5,10,100,2,-22};
         Q2(list);*/
         
 

         
    }
    

    
    //q2
    public static int Q2(int[] list){
         Scanner scanner=new Scanner(System.in);
         
         
         int min=list[0],num=0;
         
         for(int i=0;i<list.length;i++)
         {
             if(min>list[i])
                 min=list[i];
         }
         for(int i=0;i<list.length;i++)
         {
             if(min==list[i])
                 System.out.println(i);
             num=i;
         }
         return num;
    }
        

}
