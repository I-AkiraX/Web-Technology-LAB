package AAAApractice;

import java.util.Scanner;

public class basic0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var;
        var = scanner.nextInt();
        String str;
        scanner.nextLine();
        str = scanner.nextLine();
        System.out.println(var + " " + str);
        scanner.close();
    }
}