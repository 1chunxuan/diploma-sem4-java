/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem4.prac5object.oriented;
import java.util.Scanner;
/**
 *
 * @author Tang Chun Xuan
 */
public class Sem4Prac5objectOriented {
    public static void main(String[] args) {
        //q5
        //Student student=new Student("A12345","John","FASC");
        //System.out.println(Student.validateStudentId(student));
        //System.out.println(student.getName()+"is studying at" + student.getSchool());
        
        //q1
        //Scanner scanner =new Scanner(System.in);
        //System.out.println("enter one word:");
        //String word=scanner.nextLine();
        //System.out.println("enter the letter you want to count:");
        //char letter=scanner.next().charAt(0);
        //System.out.println(word + " contains "+countLetter(word,letter)+" letter");
        
        //q2
        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter a string:");
        //String word=scanner.nextLine();
        //String word1=word.toUpperCase();
        //String word2=word1.replace("A","x");
        //String word3=word2.replace("E","x");
        //String word4=word3.replace("I","x");
        //String word5=word4.replace("O","x");
        //String word6=word5.replace("U","x");
        //System.out.println("Modified String: "+word6);
        
        //q4
        int charCount=0;
        int numCount=0;
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the password");
         String password=scanner.nextLine();
         if(password.length()>=7){
             for(int i=0;i<password.length();i++){
                 char p1=password.charAt(i);
                 if(Character.isLetter(p1)||Character.isDigit(p1)){
                     if(Character.isDigit(p1))
                         numCount++;
                     else if(Character.isLetter(p1))
                         charCount++;
                 }
             }
         
             if(numCount>=1&&charCount>=1)
                         System.out.println("Valid password");
             else
                 System.out.println("Invalid password");
         }
          else
             System.out.println("Invalid password");
         
//         if(numCount>=1&&charCount>=1)
//                         System.out.println("Valid password");
//         else
//             System.out.println("Invalid password");
    }
    
    //q1
    public static int countLetter(String str, char ch){
        int num=0;
      for(int i=0;i<str.length();i++)
      {
          if (str.charAt(i) == ch){
              num++;
          }
      }
        return num;
    }
    
}
