package lab6;

public class q2 {
    public static void main(String[] args){
        System.out.println(Adder.subtract(11,13));
        System.out.println(Adder.subtract(11,12,13));
    }
}
class Adder{
    static int subtract(int a,int b){return a-b;}
    static int subtract(int a,int b,int c){return a-b-c;}
}