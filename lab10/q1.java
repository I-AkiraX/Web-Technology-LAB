package lab10;

public class q1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        for(int i = 0;i<5;i++){
            a[i]=i;
        }
        try{
            for(int i=0;i<6;i++){
                System.out.println(a[i]+" ");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch");
            e.printStackTrace();
        }
        System.out.println("Outside catch");
    }
}