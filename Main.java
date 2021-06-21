class a{
    a(){
        System.out.println("one no arg");
    }
    a(int p){
        System.out.println("one param "+ p);
    }
}
class b extends a{
    b(){
        super(10);
        System.out.println("two no arg");

    }
}
public class Main{
    public static void main(String[] args){
        b b1=new b();
        System.out.println(b1);
    }
}