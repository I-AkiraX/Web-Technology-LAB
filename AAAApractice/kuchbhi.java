package AAAApractice;

import java.util.Scanner;

public class kuchbhi {
    public static void main(String[] args) {
        String s1="y34cb68pawun8lcrweycrq793",s2="v7ygtu4t5c68q8upw;3",s3="akx7crbyx78o4x7yaxnx7o9pxa",s4="yygyugiegigedgweggggwe",s5;
        Scanner scanner = new Scanner(System.in);
        /*s5 = scanner.nextLine();
        if(s5.startsWith("ru")|| s5.endsWith("ra")){
            System.out.println(s5);
        }
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
        String s6="";
        for(int i=s2.length()-1;i>=0;i--){
            s6+=s2.charAt(i);
        }
        System.out.println("");
        s5 = scanner.nextLine();
        System.out.println(s5 + "//");
        s5=s5.trim();
        System.out.println(s5 + "//");*/
        int x=5;
        s5=String.valueOf(x);
        System.out.println(s5);
        String s7 = s1.substring(7, 16);
        String s8 = s1.substring(15);
        System.out.println(s7);
        System.out.println(s8);
        String s6[] = s3.split("7",2);
        System.out.println("\n");
        for(int i=0;i<s6.length;i++){
            System.out.println(s6[i]);
        }
        System.out.println("\n");
        String s9 = s3.replace('x', 'y');
        System.out.println(s9);
        CharSequence cs1="x7",cs2="akira";
        
        s9 = s3.replace(cs1, cs2);
        System.out.println(s9);
    }
}