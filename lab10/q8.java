package lab10;

import java.util.Scanner;

public class q8 {
    static int c;
    public static void main(String[] args) {
        System.out.print("Enter the max number: ");
        int max=Stack.scanner.nextInt();
        Stack s=new Stack(max);
        while(c!=4){
            System.out.print("\n\nPress\n1: Push\n2: Pop\n3: Display\n4: Exit\nYour choice:  ");
            c = Stack.scanner.nextInt();
            switch(c){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nInvalid input!");
            }
        }
    }
}
class Stack{
    static Scanner scanner = new Scanner(System.in);
    int max,cur;
    int a[];
    Stack(int n){
        max=n;
        cur=-1;
        a=new int[5];
    }
    void push(){
        try{
            if(max-1==cur){
                throw new FullEmp(0);
            }
            System.out.print("\nEnter the number:  ");
            a[++cur]=scanner.nextInt();
        } catch (FullEmp fe){
            fe.printStackTrace();
        }
    }
    void pop(){
        try{
            if(cur==-1){
                throw new FullEmp(1);
            }
            a[cur--]=0;
        } catch(FullEmp fe){
            fe.printStackTrace();
        }
    }
    void display(){
        for(int i=0;i<=cur;i++){
            System.out.print(a[i]+"  ");
        }
    }
}
class FullEmp extends Exception{
    int flag;
    private static final long serialVersionUID = 1L;
    FullEmp(int flag){
        this.flag=flag;
    }
    @Override
    public void printStackTrace() {
        if(flag==0){
            System.out.println("\nFull");
        } else{
            System.out.println("\nEmpty");
        }
    }
}