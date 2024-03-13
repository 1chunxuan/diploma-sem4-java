/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tang Chun Xuan
 */
public class TestEmployee {
    public static void main (String[] args){
        //Employee emp=new Employee("Li Hoong",1000);
        //System.out.println("Before " + emp.getName() +" salary " +emp.getSalary());
        //emp.raiseSalary(8);
        //System.out.println("After " + emp.getName() +" salary " + emp.getSalary());
        
        Employee emp1=new Employee();
        emp1.setName("LiHoong1");
        emp1.setSalary(1000);
        
        Employee emp2=new Employee("Li Hoong2");
        emp2.setSalary(2000);
        
        if(emp1.getSalary()>emp2.getSalary())
            System.out.println("Employee "+ emp1.getName()+" has higher salary");
        else if(emp1.getSalary()==emp2.getSalary())
            System.out.println("Both have same salary");
        else
            System.out.println("Employee " +emp2.getName()+" has higher salary");
        
        System.out.println("Total Salary= " + (emp1.getSalary()+emp2.getSalary()));
    }
            
}
