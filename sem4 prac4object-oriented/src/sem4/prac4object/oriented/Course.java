/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4;

/**
 *
 * @author admin
 */
public class Course 
{
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] StudentName;
    private static int courseCount;
    
    
    public Course(String courseTitle, double feesPerStudent)
    {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        StudentName = new String[100];
        
        courseCount++;
    }
    
    public void setCourseTitle (String courseTitle)
    {
        this.courseTitle = courseTitle;
    }
    public void setFeesOfStudent (double feesPerStudent)
    {
        this.feesPerStudent = feesPerStudent;
    }

    public String getCourseTitle ()
    {
        return courseTitle;
    }
    
    public double getFeesPerStudent()
    {
        return feesPerStudent;
    }
    
    public int getNoOfStudent()
    {
        return noOfStudents;
    }
    
    public String[] getStudentName()
    {
        return StudentName;
    }
 

    public Course() {
    }
    public static int getCourseCount()
    {
        return courseCount;
    }
    
    public double calcFeesCollected()
    {
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName)
    {
        StudentName[noOfStudents] = studName;
        noOfStudents++;
    }

    
    @Override
        public String toString()
    {
        return "CourseTitle=" +courseTitle + ",feesPerStudent =" 
                +feesPerStudent +", StudentName =" +StudentName +", courseCount =" +courseCount;
    }


}


