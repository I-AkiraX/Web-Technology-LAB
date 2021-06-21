package lab7;

import java.util.Scanner;

public class Shape {
    double area;
    Scanner scanner = new Scanner(System.in);
    void showArea(){
        System.out.println("Area = " + area);
    }
}
class Circle extends Shape{
    double r;
    void calculate(){
        System.out.print("Enter the radius: ");
        r=scanner.nextDouble();
        area = 3.14*r*r;
        showArea();
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculate();
    }
}
class Rectangle extends Shape{
    double l,b;
    void calculate(){
        System.out.print("Enter the length and breadth: ");
        l=scanner.nextDouble();
        b=scanner.nextDouble();
        area = l*b;
        showArea();
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculate();
    }
}