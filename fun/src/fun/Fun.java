/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fun;

/**
 *
 * @author Tang Chun Xuan
 */
public class Fun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num={4,9,6,4};
        String[] symbol={};
        boolean answer=false;
        int i=0;
        int show=5;
        
        for(i=0;i<4;i++){
             if(i!=3){
            System.out.println(num[i]);
            
            System.out.println(num[i]+num[i+1]);     
            
             if(num[i]+num[i+1]!=10)
                System.out.println(answer);
            else{
                answer=true;
                System.out.println(answer);
            }
            }
             else{
                 System.out.println(num[i]+num[i-3]);
                 
             }
            

            
           
        }
        
        
    }
    
}
