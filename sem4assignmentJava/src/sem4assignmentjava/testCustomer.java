/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem4assignmentjava;

import java.util.Scanner;

/**
 *
 * @author Tang Chun Xuan
 */
public class testCustomer {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        Customer[] customers = new Customer[100];
        customers[0] = new Customer("aaa", "line123", "2222");
        char reply = ' ';
        String reply2 = "";
        char reply3 = ' ';
        String name = "";
        String phoneNum;
        String addr;
        int count = 1;
        boolean correct = false;
        boolean correct2 = false;
        boolean correct3 = false;
        boolean correct4 = false;
        int countCust = count;
        do {

            System.out.println("Enter the phone number:");
            reply2 = scanner.nextLine();

            for (int i = 0; i < count; i++) {

                if (customers[i].getPhoneNumber().equals(reply2)) {
                    correct = true;
                    break;
                }
            }

//                correct=customer.validateCustId(reply2);
            if (correct != true) {
                do {
                    System.out.println("Please register as customer first.");
                    System.out.println("Name:");
                    name = scanner.nextLine();

                    System.out.println("Phone number:");
                    phoneNum = scanner.nextLine();

                    System.out.println("Address:");
                    addr = scanner.nextLine();

                    correct2 = customer.validateCustName(name);
                    correct3 = customer.validatephoneNum(phoneNum);
                    correct4 = customer.validateCustAddr(addr);

                    if (correct2 == false || correct3 == false || correct4 == false) {
                        System.out.println("enter again!");
                        //break;
                    } else {
                        Customer cust = new Customer();
                        cust.setAddress(addr);
                        cust.setCustName(name);
                        cust.setPhoneNumber(phoneNum);
                        customers[countCust] = cust;
                        countCust++;
                        count++;
                        break;
                    }
                } while (correct2 == false);
            }

//            customers[count] = new Customer();
//            count++;
            System.out.println("Welcome become one of us! " +name);
            System.out.println("do you want to continue input?if yes,enter y or Y,else n:");
            reply = scanner.nextLine().charAt(0);

        } while (reply == 'y' || reply == 'Y');
    }

    /*public stativ void checkStatus(){
           
     */
}
