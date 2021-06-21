package lab7;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        new WoodBox();
    }
}
class Plate{
    int l,b;
    Scanner scanner = new Scanner(System.in);
    Plate(){
        System.out.println("Enter the length and breadth:");
        l=scanner.nextInt();
        b=scanner.nextInt();
    }
}
class Box extends Plate{
    int h;
    Box(){
        System.out.println("Enter the height:");
        h=scanner.nextInt();
    }
}
class WoodBox extends Box{
    int t;
    WoodBox(){
        System.out.println("Enter the thickness:");
        t=scanner.nextInt();
    }
}