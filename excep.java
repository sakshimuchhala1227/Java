import java.util.Scanner;
class NegBal extends Exception
{
    String msg=" ";
    NegBal()
    {
        msg="Negative Balance xeception";
    }
    public String toString(){
        return msg;
    }
}
class MinBal extends Exception{
    String msg=" ";
    MinBal()
    {
        msg="Minimum Balance Exception";
    }
    public String toString()
    {
        return msg;
    }
}
public class excep
{
    int bal=10000;
    public void withdraw(int amount) throws NegBal,MinBal
    {

        if(bal<amount)
        {
            throw new NegBal();
        }
        else{
            if((bal-amount)<1000)
            {
                throw new MinBal();

            }
            else
            bal=bal-amount;
            System.out.println(bal);
        }
    }
    public static void main(String a[])
    {
        excep b=new excep();
        try{
            b.withdraw(5000);
            b.withdraw(4000);
            b.withdraw(1);
        }
        catch(NegBal e)
        {
            System.out.println(e);

        }
        catch(MinBal e)
        {
             System.out.println(e);
        }
    }
}