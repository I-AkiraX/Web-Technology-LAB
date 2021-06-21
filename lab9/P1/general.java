package lab9.P1;
public class general{
    protected int empid;
    private String ename;
    public general(int a, String b){
        empid=a;
        ename= b;
        System.out.println("The name of employee is "+ename);
    }
    public double earning(double basic){
        double da=0.80*basic;
        double hra=0.15*basic;
        double era=basic+da+hra;
        return era;
    }
}