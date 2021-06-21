package lab11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class alttext{
    public static void main(String[] args) {
        int i;
        String str="",str1="";
        try {
            FileInputStream fileInputStream = new FileInputStream("./lab11/ip.txt");
            while((i = fileInputStream.read()) != -1){
                str += (char) i;
                if((char)i == '#'){
                    str1 += ' ';
                }else{
                    str1 += (char)i;
                }
            }
            System.out.println(str + "\n" + str1);
            fileInputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream("./lab11/op.txt");
            byte arr[] = str1.getBytes();
            fileOutputStream.write(arr);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}