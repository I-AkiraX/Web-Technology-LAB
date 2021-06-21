package lab4;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lname,fname;
        System.out.println("Enter the first name:");
        fname = scanner.nextLine();
        System.out.println("Enter the last name:");
        lname = scanner.nextLine();
        System.out.println(lname + " " + fname);
        scanner.close();
    }
}
