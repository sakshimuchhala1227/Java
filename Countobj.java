class Countobj {
    static int count=0;
    Countobj()
    {
       count++;
    }
    public static void main(String a[])
    {
        Countobj c =new Countobj();
        Countobj c1 =new Countobj();
        Countobj c3 =new Countobj();
        System.out.println("total number of objects are "+count);
    }
    
}
