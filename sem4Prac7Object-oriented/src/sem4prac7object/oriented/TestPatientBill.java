/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4prac7object.oriented;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestPatientBill {
    
    public static double computeTotalCollection(PatientBill[] patientBills){
        double sum=0;
        for(PatientBill patientBill:patientBills)
        {
            sum+=patientBill.calcTotalCharges();
        }
        return sum;
    }
    
    public static void main(String[] args){
        PatientBill[] patientBills=new PatientBill[4];
        patientBills[0]=new InpatientBill("B",100,200,"S",2);
        patientBills[1]=new InpatientBill("C",200,300,"S",3);
        patientBills[2]=new outpatientBill("E",250);
        patientBills[3]=new outpatientBill("A",50);
        
        for(PatientBill patientBill:patientBills){
            System.out.println(patientBill.toString());
            System.out.println("Total Charges : "+patientBill.calcTotalCharges());
        }
        System.out.println("Sum of all Total Charges : "+computeTotalCollection(patientBills));
        
        patientBills=selectionSort(patientBills);
        System.out.println("After selection sort");
        for(PatientBill patientBill:patientBills){
        System.out.println(patientBill.toString());
        System.out.println("Total Charges : "+patientBill.calcTotalCharges());
        }
    }
    
public static PatientBill[] selectionSort(PatientBill[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			int indexOfSmallest = i;	// assign the first index of the subarray as the initial indexOfSmallest
			for (int j = i+1; j < arr.length; ++j) {
				if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
					indexOfSmallest = j;														// element at indexOfSmallest, update indexOfSmallest
			}
			// swap the element at indexOfSmallest with the current subarray's first element 																									
			PatientBill tempArr = arr[indexOfSmallest];
			arr[indexOfSmallest] = arr[i];
			arr[i] = tempArr;
		}
		return arr;
	}

}
