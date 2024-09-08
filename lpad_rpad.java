import java.util.*;
public class lpad_rpad {
    static Scanner scr=new Scanner(System.in);
    static String input;
    static String padstring;
    lpad_rpad() 
    {
    System.out.println("enter the String you want to print");
    input=scr.nextLine();
    }
    void padlen(int n,char s)
    {
        int padding_len=n-input.length();
        // System.out.println(padding_len);
        if (padding_len<=0)
        {
            System.out.println(input);
        }
        else{
        padstring = new String(new char[padding_len]).replace('\0', s);
        }
    }
    String lpad()
    {  
        //  System.out.println("inside lpad fun");
        if(padstring==null)
        {
            return(input);
        }
        return(padstring+input);
    }
    String rpad()
    {
        // System.out.println("inside rpad fun");
        if(padstring==null)
        {
            return(input);
        }
        return(input+padstring);
    }
    public static void main(String a[])
    {
        lpad_rpad d=new lpad_rpad();
        // Scanner scr=new Scanner(System.in);
        // System.out.println("enter the number you want to print");
        // int n1=scr.nextInt();
        System.out.println("enter the Character and number which you want to be the leading or preceding number/string ");
        char c = scr.next().charAt(0);
        int num = scr.nextInt();
        d.padlen(num,c);
        System.out.println("enter 1 for lpad and 2 for rpad ");
        int choice=scr.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println(d.lpad());
            break;

            case 2:
            System.out.println(d.rpad());
            break;

            default:
            System.out.println("enter a valid number ");
        }
    scr.close();
    }
}
// import java.util.Scanner;

// public class FormatStringsAndIntegers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         StringBuilder output = new StringBuilder();

//         // Upper design line
//         output.append("================================\n");

//         // Read input until there is no more input
//         while (scanner.hasNext()) {
//             String str = scanner.next();
//             int num = scanner.nextInt();

//             // Format the output as specified
//             String formattedString = String.format("%-15s%03d", str, num);
//             output.append(formattedString).append("\n");
//         }

//         scanner.close();

//         // Lower design line
//         output.append("================================");

//         // Print the complete formatted output
//         System.out.println(output.toString());
//     }
// }
