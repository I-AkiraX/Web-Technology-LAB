package lab5;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int sumr=0,suml=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of 3X3 matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sumr+=a[i][j];
                }
                if((i+j)==2){
                    suml+=a[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal: "+sumr+"\nSum of left diagonal: "+suml);
        scanner.close();
    }
}
