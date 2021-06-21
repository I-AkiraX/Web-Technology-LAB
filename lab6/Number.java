package lab6;

import java.util.Scanner;

public class Number {
    int n;
    int a[];
    public static void main(String[] args) {
        Number number = new Number();
        number.read();
        number.display();
        number.swap();
        System.out.println("");
        number.display();
    }
    void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        n = scanner.nextInt();
        a = new int[n];
        System.out.println("Enter the integers:");
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
    }
    void swap(){
        int max,min,maxPos=0,minPos=0,temp;
        max=a[0];
        min=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                maxPos=i;
            }
            if(min>a[i]){
                min=a[i];
                minPos=i;
            }
        }
        temp=a[maxPos];
        a[maxPos]=a[minPos];
        a[minPos]=temp;
    }
    void display(){
        System.out.println("Entered array:");
        for (int i=0;i<n;i++){
            System.out.print(a[i] + "  ");
        }
    }
}