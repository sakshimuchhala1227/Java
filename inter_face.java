interface A{
   int x=100;
   void show();
}
interface B{
    int x=10;
   void show();
}
class C implements A,B
{
    C()
    {
        // super(x);
        System.out.println(A.x);
    }
    public void show()
    {
       System.out.println(B.x);
    }
}
public class inter_face {
    public static void main(String a[])
    {
        C c=new C();
        c.show(); 
    }
    
}
