package lab6;

import java.util.Scanner;

public class rectangle {
    int length, breadth, area, perimetre;
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        obj.input();
        obj.display();
    }
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        calculate();
        scanner.close();
    }
    void calculate(){
        area = length*breadth;
        perimetre = 2*(length+breadth);
    }
    void display(){
        System.out.println("Area = " + area + "\nPerimetre = " + perimetre);
    }
}
