package lab10;

import java.util.Scanner;

public class q4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            int x = scanner.nextInt();
            if(x<0){
                throw new NegativeNumberException();
            }
            System.out.println(x*2);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }
}
class NegativeNumberException extends Exception{
    private static final long serialVersionUID = 1L;
    @Override
    public void printStackTrace() {
        System.out.println("");
    }
}