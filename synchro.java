class table{
    int t;
    int n;
    table(int t , int n)
    {
        this.t=t;
        this.n=n;
    }
    synchronized void mytable()
    {
        for(int i=1;i<n;i++)
        {
            // try{
                System.out.println(i*t);
                // Thread.sleep(1000);
            // }
            // catch(InterruptedException e)
            // {
            //     System.out.println(e);
            // }

        }
    }
}
class myth extends Thread{
    myth()
    {
        start();
    }
    public void run()
    {
        table t1=new table(2,10);
        t1.mytable();
        table t2=new table(3,12);
        t2.mytable();
    }
}
public class synchro {
    public static void main ( String[] a){
        myth m=new myth();
        myth m1=new myth();

    }  
}


// class Table {
//     int t;
//     int n;

//     Table(int t, int n) {
//         this.t = t;
//         this.n = n;
//     }

//     synchronized void myTable() {
//         for (int i = 1; i <= n; i++) {
//             System.out.println(i * t);
//         }
//     }
// }

// class Myth extends Thread {
//     private Table table;

//     Myth(Table table) {
//         this.table = table;
//     }

//     public void run() {
//         table.myTable();
//     }
// }

// public class synchro{
//     public static void main(String[] args) {
//         Table t1 = new Table(2, 10);
//         Table t2 = new Table(3, 12);

//         Myth m1 = new Myth(t1);
//         Myth m2 = new Myth(t2);

//         m1.start();
//         m2.start();
//     }
// }
