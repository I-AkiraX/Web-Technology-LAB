package lab4;

public class q2 {
    public static void main(String[] args) {
        double mark=99.99;
        if(mark==100){
            System.out.print("Grade: O");
        }
        else if(mark>90 && mark <100){
            System.out.print("Grade: E");
        }
        else if(mark>80 && mark <=90){
            System.out.print("Grade: A");
        }
        else if(mark >70 && mark <=80){
            System.out.print("Grade: B");
        }
        else if(mark >60 && mark <=70){
            System.out.print("Grade: C");
        }
        else if(mark>50 && mark <=60){
            System.out.print("Grade: D");
        }
        else {
            System.out.print("FAIL!!");
        }
    }
}
