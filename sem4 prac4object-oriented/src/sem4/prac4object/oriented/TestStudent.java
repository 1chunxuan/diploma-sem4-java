/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4.prac4object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestStudent {
   public static void main(String[] args){
       //q2
       /*Student student=new Student();
       student.setName("HAHA");
       student.setStudId("A111");
//       student.addQuiz(8);
//       System.out.println("Total score is " + student.getTotalScore() );
       student.addQuiz(8);
       student.addQuiz(10);
       System.out.println("Name is " + student.getName() );
       System.out.println("Student Id is " + student.getStudId() );
       System.out.println("Total score is " + student.getTotalScore() );
       System.out.println("Num of quiz is " + student.numQuizTaken );
       System.out.println("Average score is " + student.getAverageScore());*/
      
      //q3
             Student.setQuizContribution(20);
      Student student=new Student();
       student.setName("HAHA");
       student.setStudId("A111");
//       student.addQuiz(8);
//       System.out.println("Total score is " + student.getTotalScore() );
       student.addQuiz(8);
       student.addQuiz(10);
       student.addQuiz(9);

       
       System.out.println("Name is " + student.getName() );
       System.out.println("Student Id is " + student.getStudId() );
       System.out.println("Total score is " + student.getTotalScore() );
       System.out.println("Num of quiz is " + student.numQuizTaken );
       System.out.println("Average score is " + student.getAverageScore());
       System.out.println("The coursework mark is "+student.getAverageScore()/10*Student.quizContribution);
       
        Student student2=new Student();
       student2.setName("gg");
       student2.setStudId("A222");
       student2.addQuiz(8);
       student2.addQuiz(11);
       student2.addQuiz(9);

       
       System.out.println("Name is " + student2.getName() );
       System.out.println("Student Id is " + student2.getStudId() );
       System.out.println("Total score is " + student2.getTotalScore() );
       System.out.println("Num of quiz is " + student2.numQuizTaken );
       System.out.println("Average score is " + student2.getAverageScore());
       System.out.println("The coursework mark is "+student2.getAverageScore()/10*Student.quizContribution);
       
       
       
    }
}
