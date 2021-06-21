package AAAApractice;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,mname;
        System.out.println("Enter the name: ");
        name = scanner.nextLine();
        System.out.println("Enter the middle name: ");
        mname = scanner.nextLine();
        String fname[] = name.split(" ",2);
        name = fname[0] + " " + mname + " " + fname[1];
        System.out.println(name);
    }
}
