package lab4;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,temp,revnum=0;
        num = scanner.nextInt();
        temp = num;
        while(temp!=0){
            revnum *= 10;
            revnum += temp%10;
            temp /= 10;
        }
        if(revnum == num){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
        scanner.close();
    }
}