/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac5object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
//q5
public class Student {
    private String studentId;
    private String name;
    private String school;
    
    public Student(String studentId,String name,String school)
    {
        this.studentId=studentId;
        this.name=name;
        this.school=school;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
    public static boolean validateStudentId(Student student)
    {
        String id=student.getStudentId();
        char schoolCode=Character.toUpperCase(id.charAt(0));
       
        //check is letter?
        if(!Character.isLetter(schoolCode)){
            return false;
        }
            
        if(id.length()!=6)
        {
            return false;
        }
        
        //check 5 digit
        String number=id.substring(1,id.length());
        if(number.length()!=5){
            return false;
        }else
            for(int i=0;i<number.length();i++)
            {
                if(!Character.isDigit(number.charAt(i))){
                    return false;
                }
            }
        boolean valid =true;
        switch(schoolCode)
        {
            case 'A':valid=student.getSchool().equals("FASC");break;
            case 'B':valid=student.getSchool().equals("FAFB");break;
        }
    
    return valid;
    }
}
