class B{
    int x=10;
    B()
    {
        System.out.println("constructor of class B");
    }
    void show()
    {
        System.out.println("method of class B is called "+x);
    }
}
class A extends B{
    int x=100;
    A()
    {    
        super.show();
        System.out.println("consturctor of class A");
    }
    void show(){
        System.out.println("method of class A is called "+x);
        
    }
}
public class inheritance{
    public static void main(String args[])
    {
        A a=new A();
        a.show();
    }
}