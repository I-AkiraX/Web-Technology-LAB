package lab6;

import java.util.Scanner;

public class box {
    int length, width,height;
    public int volume(){return length*width*height;}
    box(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length, width and height:");
        length = scanner.nextInt();
        width = scanner.nextInt();
        height = scanner.nextInt();
        scanner.close();
    }
}
class Demo{
    public static void main(String[] args) {
        box b = new box();
        System.out.println("Volume = " + b.volume() + " cube units.");
    }
}
