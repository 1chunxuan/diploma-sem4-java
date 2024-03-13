/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4;

/**
 *
 * @author admin
 */
public class TestCourse 
{ 
    public static void main(String[]args)
    {
        Course course = new Course("Introduction to Computers", 250.0);
        
        course.addStudent("Ali said");
        course.addStudent("Wong Ken");
        course.addStudent("Peter Lim");
        
        System.out.println(course);
        
        System.out.println("Total Fees Collected(RM) =" +course.calcFeesCollected());
        
        for(String value:course.getStudentName())
        {
            if(value !=null)
                System.out.println("Student enrolled :" +value);
        }
    }
}
