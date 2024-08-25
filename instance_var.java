public class instance_var{
    int r;
    String n;
    instance_var()
    {
        r=1;
        n="sakshi";
    }

    instance_var(int r, String n)
    {
        this.r=r;
        this.n=n;
    
    }
    public String toString()
    {
          return("roll "+r+" name "+n);
    }
    public static void main(String args[])
    {
        
        instance_var s1=new instance_var();
        System.out.println(s1);
        instance_var s2=new instance_var(101,"priyanshi");
        System.out.println(s2);
    }

}