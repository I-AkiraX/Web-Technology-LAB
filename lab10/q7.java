package lab10;

import java.util.Scanner;

public class q7 {
    static double balance=500;
    static int c;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nAccount created with minimum balance of Rs.500!");
        while(c!=4){
            System.out.print("\n\nPress\n1: Check balance\n2: Deposit money\n3: Withdraw money\n4: Exit\nYour choice:  ");
            c = scanner.nextInt();
            switch(c){
                case 1:
                    System.out.println("\nBalance = " + balance);
                    break;
                case 2:
                    System.out.print("\nEnter the amount you want to deposit: ");
                    double amount = scanner.nextDouble();
                    balance += amount;
                    break;
                case 3:
                    System.out.print("\nEnter the amount you want to withdraw: ");
                    amount = scanner.nextDouble();
                    try{
                        if(balance-amount >= 500){
                            balance -= amount;
                        } else{
                            throw new LessBalanceException();
                        }
                    } catch(LessBalanceException lbe){
                        lbe.printStackTrace();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nInvalid input!");
            }
        }
    }
}
class LessBalanceException extends Exception{
    private static final long serialVersionUID = 1L;
    @Override
    public void printStackTrace() {
        System.out.println("\n\nWithdraw amount invalid! Minimum balance should be Rs500.\n\n");
    }
}