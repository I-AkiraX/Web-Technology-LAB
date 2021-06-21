package lab10;

public class q6 {
    static int result=0;
    public static void main(String[] args) {
        try {
            int l = args.length;
            if(l>4){
                throw new CheckArgument();
            }
            for(int i=0;i<l;i++){
                int x=Integer.parseInt(args[i]);
                result+=x*x;
            }
            System.out.println(result);
        } catch (CheckArgument cae) {
            cae.printStackTrace();
        }
    }
}
class CheckArgument extends Exception{
    private static final long serialVersionUID = 1L;
    @Override
    public void printStackTrace() {
        System.out.println("Command line arguments > 4");
    }
}