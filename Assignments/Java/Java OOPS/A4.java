abstract class a{
    abstract public void f1();
    public void f2(){
        System.out.println("hello");
    }
    
}
public class A4 extends a{
    public void f1(){
        System.out.println("hi");
    }
    public static void main(String[] args) {

        A4 obj = new A4();
        obj.f1();
        obj.f2();
}
}