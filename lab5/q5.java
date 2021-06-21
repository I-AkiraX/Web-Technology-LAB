package lab5;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int n,m=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        n = scanner.nextInt();
        int a[] = new int[n];
        int temp[] = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i ++ ){
            a[i] = scanner.nextInt();
        }
        temp[0]=a[0];
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<m;j++){
                if(a[i]==temp[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                temp[m++]=a[i];
            }
        }
        for(int j=0;j<m;j++){
            int x=0;
            for(int i=0;i<n;i++){
                if(temp[j]==a[i]){
                    x++;
                }
            }
            System.out.println("Number of times "+temp[j]+" has occured = "+x);
        }
        scanner.close();
    }
}