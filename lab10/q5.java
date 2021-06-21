package lab10;

import java.util.Scanner;

class Time {
    static int hours,minutes,seconds;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            hours=scanner.nextInt();
            minutes=scanner.nextInt();
            seconds=scanner.nextInt();
            if(hours>24||hours<0){
                throw new HrsException();
            }
            if(minutes>60||minutes<0){
                throw new MinException();
            }
            if(seconds>60||seconds<0){
                throw new SecException();
            }
        } catch (HrsException he) {
            he.printStackTrace();
        } catch(MinException me){
            me.printStackTrace();
        } catch(SecException se){
            se.printStackTrace();
        }
    }
}
class HrsException extends Exception{
    private static final long serialVersionUID = 1L;
    @Override
    public void printStackTrace() {
        System.out.println("Hours>24 or Hours<0");
    }
}
class MinException extends Exception{
    private static final long serialVersionUID = 1L;
    @Override
    public void printStackTrace() {
        System.out.println("Minutes>60 or Minutes<0");
    }
}
class SecException extends Exception{
    private static final long serialVersionUID = 1L;
    @Override
    public void printStackTrace() {
        System.out.println("Seconds>60 or Seconds<0");
    }
}