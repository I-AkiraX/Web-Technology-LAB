package lab9.P2;

public class marketing extends lab9.P1.general {
    public marketing(int a, String b) {
        super(a, b);
        System.out.println("The empid of the employee is " + empid);
    }

    public double tallowance(double basic) {
        double tot_ear = super.earning(basic);
        double s = 0.05 * tot_ear;
        System.out.println("The total earning is " + tot_ear);
        return s;
    }
}