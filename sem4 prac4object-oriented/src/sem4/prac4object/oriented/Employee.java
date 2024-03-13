/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tang Chun Xuan
 */
public class Employee {
    /*
public class Employee {
    String name;
    double salary;
    
    Employee(String employeeName, double currentSalary) {
    name = employeeName;
    salary = currentSalary;
   }
    
    void raiseSalary(double percent){
     salary = salary + (salary * percent / 100.0);
    }
}*/
    
    private String name;
    private double salary;
    
    //no-arg constructor
    public Employee(){
        name="";
        salary=0.0;
    }
    
    //constructor with 1 parameter
    public Employee(String name){
        this.name=name;
        salary=0.0;
    }
    
    //constructor with 2 parameters
    public Employee(String employeeName, double currentSalary) {
    this.name = employeeName;
    salary = currentSalary;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void raiseSalary(double percent){
     salary = salary + (salary * percent / 100.0);
    }
    
    
}
