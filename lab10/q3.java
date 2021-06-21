package lab10;

public class q3 {
    public static void main(String[] args) {
        try{
            int x = 1/0;
        } catch(Exception e){
            System.out.println("Inside catch");
            e.printStackTrace();
        } finally{
            System.out.println("Inside finally");
        }
        System.out.println("Outside every shit");
    }
}