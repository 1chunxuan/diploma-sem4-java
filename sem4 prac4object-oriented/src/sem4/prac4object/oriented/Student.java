/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class Student {
    //q2
   /* String name;
    String studId;
    int numQuizTaken;
    double totalScore;
    
    //no-arg constructor
    public Student(){
       name="";
       studId="";
      numQuizTaken=0;
       totalScore=0.0;
    }
    
    //constructor with name,student ID
    public Student(String studId,String name){
        this.studId=studId;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

   public void addQuiz(int mark){
        numQuizTaken++;
        totalScore+=mark;
    }

    public double getTotalScore(){
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }
    
    public double getAverageScore(){
        return totalScore/numQuizTaken;
    }*/
    
    //q3
   String name;
    String studId;
    int numQuizTaken;
    double totalScore;
    static double quizContribution;
    
    
    //no-arg constructor
    public Student(){
       this.name="";
       this.studId="";
      this.numQuizTaken=0;
       this.totalScore=0.0;
    }
    
    //constructor with name,student ID
    public Student(String studId,String name){
        this.studId=studId;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

   public void addQuiz(int mark){
        numQuizTaken++;
        totalScore+=mark;
    }

    public double getTotalScore(){
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }
    
    public double getAverageScore(){
        return totalScore/numQuizTaken;
    }
    
//     public void setQuizContribution(double quizContribution){
//         this.quizContribution=quizContribution;
//     }
//     
//     public double getQuizContribution(){
//         return quizContribution;
//     }

    public static double getQuizContribution() {
        return quizContribution;
    }

    public static void setQuizContribution(double quizContribution) {
        Student.quizContribution = quizContribution;
    }
     
     //q6
    
    
}