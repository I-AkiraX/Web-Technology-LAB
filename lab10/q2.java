package lab10;

public class q2 {
    public static void main(String[] args) {
        try {
            int x =1;
            x/=0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Working!");
            e.printStackTrace();
        } /*catch(ArithmeticException ae){
            System.out.println("Won't work!");
            ae.printStackTrace();
        }*/ //second catch block will never be reached by program because super class exception has been given before the sub class exception
        //thus subclass exception catch block must always be created before the super class exception catch block
    }
}