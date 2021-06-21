package lab9;
import lab9.P2.marketing;
import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp id and ename: ");
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter the basic: ");
        double basic=sc.nextDouble();
        marketing ob=new marketing(id,name);
        double total=ob.tallowance(basic);
        System.out.println("The total allowance is: "+total);
        sc.close();
    }
}