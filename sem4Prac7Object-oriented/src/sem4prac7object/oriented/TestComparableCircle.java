/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4prac7object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestComparableCircle {
    public static void main(String[] args){
        ComparableCircle circle1=new ComparableCircle(1);
        ComparableCircle circle2=new ComparableCircle(2);
        
        if(circle1.compareTo(circle2)==1){
            System.out.println("Circle 1 have larger radius : "+circle1.getRadius());
        }
        else if(circle1.compareTo(circle2)==-1){
            System.out.println("Circle 2 have larger radius : "+circle2.getRadius());
        }else
               System.out.println("Both have same radius "+circle2.getRadius()); 
        
        
        circle1.howToColor();
    }
}
