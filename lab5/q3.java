package lab5;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int n,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i ++ ){
            a[i] = scanner.nextInt();
        }
        System.out.println("\nAfter sorting:");
        for(int i = 0; i < n; i ++){
            for(int j = i+1; j < n; j ++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        scanner.close();
    }
}