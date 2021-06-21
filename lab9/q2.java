package lab9;

import java.util.Scanner;

public class q2 {
    static String str1,str2;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string:  ");
        str1 = scanner.nextLine();
        System.out.println(changeCase());
        System.out.println(revStr());
        System.out.print("Enter the string: ");
        str2=scanner.nextLine();
        CompareStr();
        System.out.println(insert());
    }
    static String changeCase(){
        String result="";
        for(int i=0;i<str1.length();i++){
            if(Character.isLowerCase(str1.charAt(i))){
                result += Character.toUpperCase(str1.charAt(i));
            }
            else{
                result += Character.toLowerCase(str1.charAt(i));
            }
        }
        return result;
    }
    static String revStr(){
        String result="";
        for(int j=str1.length()-1;j>=0;j--){
            result += str1.charAt(j);
        }
        return result;
    }
    static void CompareStr(){
        int flag =0;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("Not equal!");
            }else{
                System.out.println("Equal!");
            }
        }
        else{
            System.out.println("Not equal!");
        }
    }
    static String insert(){
        String result="";
        result += str1;
        for(int i=0;i<str2.length();i++){
            result += str2.charAt(i);
        }
        return result;
    }
}
