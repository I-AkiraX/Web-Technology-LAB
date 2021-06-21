package lab6;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student studArray[] = new Student[n];
        for ( int i=0; i<n;i++){
            studArray[i] = new Student();
            studArray[i].input(scanner);
        }
        for(int i=0;i<n;i++){
            studArray[i].output();
        }
        Student.lowCgpa();
        scanner.close();
    }
}
class Student{
    int roll;
    double cgpa;
    String name;
    static Student stud = new Student();
    Student(){
        roll = 0;
        cgpa = 0.0;
        name = null;
    }
    public void input(Scanner scanner){
        scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Roll number: ");
        roll = scanner.nextInt();
        System.out.print("CGPA: ");
        cgpa = scanner.nextDouble();
        if(stud.name == null){
            stud.name = name;
            stud.roll = roll;
            stud.cgpa = cgpa;
        }
        else {
            if(stud.cgpa>cgpa){
                stud.name = name;
                stud.roll = roll;
                stud.cgpa = cgpa;
            }
        }
    }
    public void output(){
        System.out.println("\nName: " + name + "\nRoll number: " + roll + "\nCGPA: " + cgpa);
    }
    static public void lowCgpa(){
        System.out.println("\nName of the studemt having lowest cgpa = " + stud.name);
    }
}