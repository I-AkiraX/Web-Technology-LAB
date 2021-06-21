package lab5;

public class q4 {
    static int n = 0;
    q4(){
        n++;
    }
    static void print(){
        System.out.println("Number of objects: " + n);
    }
    public static void main(String[] args) {
        new q4();
        new q4();
        print();
    }
}
