import java.util.Scanner;

class Complex {
    static Scanner scanner = new Scanner(System.in);
    int real, img;

    Complex() {
        System.out.print("Enter the real part:  ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginery part:  ");
        img = scanner.nextInt();
    }
    Complex(Complex complex1, Complex complex2) {
        real = complex1.real + complex2.real;
        img = complex1.img + complex2.img;
    }
    public String printComplex() {
        return (real + " + " + img + "i");
    }

}
public class P6 {
    public static void main(String[] args) {
        System.out.println("Enter the first complex number:\n");
        Complex c1 = new Complex();
        System.out.println("\n\nEnter the second complex number:\n");
        Complex c2 = new Complex();
        Complex c3 = new Complex(c1, c2);
        System.out.println("\n\n" + c1.printComplex() + " + " + c2.printComplex() + " = " + c3.printComplex());
    }
}