package lab8;

abstract class student{
    int roll,regno;
    abstract void course();
}
class kiitian extends student{
    void course(){
        System.out.println("Lawde ka course");
    }
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.course();
    }
}
