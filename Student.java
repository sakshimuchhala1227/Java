class Student{
    int roll;
    String name;
    float marks;
    void display()
    {
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String a[]) {
        int a1=Integer.parseInt(a[0]);
       float f=Float.parseFloat(a[2]);
       Student s1=new Student();
       System.out.println(s1);
       s1.display(); 
       s1.roll=a1;
       s1.name=a[1];
       s1.marks=f;
       System.out.println(s1);
       s1.display();  
    }
}