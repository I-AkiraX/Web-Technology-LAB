package lab7;

import java.util.Scanner;

public class Account {
    int acc_no;
    double balance;
    void disp(){
        System.out.print("Account Number: " + acc_no + "\nBalance: " + balance);
    }
}
class Person extends Account{
    String name;
    String aadhaar_no;
    Scanner scanner = new Scanner(System.in);
    void enter(){
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the aadhaar number: ");
        aadhaar_no = scanner.nextLine();
    }
    void disp(){
        System.out.println("Name: " + name + "\nAadhaar number: " + aadhaar_no);
    }
    public static void main(String[] args) {
        Person p[]=new Person[5];
        for(int i=0;i<5;i++){
            p[i]= new Person();
            p[i].enter();
        }
        for( int i=0;i<5;i++){
            System.out.print("Person " + (i+1) + "\n");
            p[i].disp();
        }
    }
}