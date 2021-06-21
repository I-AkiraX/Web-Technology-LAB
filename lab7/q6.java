package lab7;

public class q6 {
    q6(int a, int b){
        System.out.println("a= " + a + " b= " + b);
    }
}
class derived extends q6{
    derived(){
        super(3,7);
    }
    public static void main(String[] args) {
        new derived();
    }
}