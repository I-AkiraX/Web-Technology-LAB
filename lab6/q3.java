package lab6;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press to find area of-\n1: Circle\n2: Square\n3: Triangle\nYour choice:  ");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                System.out.print("Enter the radius: ");
                double r = scanner.nextDouble();
                Area.area(r);
                break;
            case 2:
                System.out.print("Enter the side: ");
                double s = scanner.nextDouble();
                Area.area(1,s);
                break;
            case 3:
                System.out.println("Enter the base and height: ");
                double b = scanner.nextDouble();
                double h = scanner.nextDouble();
                Area.area(b,h);
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
        scanner.close();
    }
}
class Area{
    static void area(double r){
        System.out.println("Area = " + 3.14*r*r + " units.");
    }
    static void area(int x,double s){
        System.out.println("Area = " + s*s + " units.");
    }
    static void area(double b,double h){
        System.out.println("Area = " + 0.5*b*h + " units.");
    }
}