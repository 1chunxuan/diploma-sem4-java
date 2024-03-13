/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4q4object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class Owner {
    private String ic;
    private String name;
    
    public Owner(String ic,String name){
        this.ic=ic;
        this.name=name;
    }
    
    public String toString(){
        return "\t " + ic +
               "\t " + name ;
    }
}
