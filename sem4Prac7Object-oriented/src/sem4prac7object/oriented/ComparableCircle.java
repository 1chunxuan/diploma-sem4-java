/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4prac7object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class ComparableCircle extends Circle implements Comparable,Colorable{

    public ComparableCircle(double radius){
        super(radius);
    }
    
    @Override
    //Comparable interface
    public int compareTo(Object o) {
        ComparableCircle otherCircle=(ComparableCircle)o;
        if(getRadius()>otherCircle.getRadius())
            return 1;
        else if(getRadius()<otherCircle.getRadius())
            return -1;
        else 
            return 0;
    }
    
     @Override
     //Colorable interface
     public void howToColor(){
         System.out.println("Color red");
     }
    
}
