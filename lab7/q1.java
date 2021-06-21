package lab7;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        ThreeD obj = new ThreeD();
        obj.calculate();
    }
}
class TwoD{
    int l,b;
    static Scanner scanner = new Scanner(System.in);
    TwoD(){
        System.out.print("Enter the length: ");
        l = scanner.nextInt();
        System.out.print("Enter the breadth: ");
        b = scanner.nextInt();
    }
    void calculate(){
        System.out.println("Price of 2D sheet = " + (l*b*40));
    }
}
class ThreeD extends TwoD{
    int h;
    ThreeD(){
        System.out.print("Enter the height: ");
        h = scanner.nextInt();
    }
    void calculate(){
        super.calculate();
        System.out.println("Price of 3D box = " + (l*b*h*60));
    }
}