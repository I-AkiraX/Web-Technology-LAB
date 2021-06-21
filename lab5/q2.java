package lab5;

public class q2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i = 0;i<10;i++){
            a[i] = Integer.parseInt(args[i]);
        }

        int even = 0,odd = 0;
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
            if(a[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}