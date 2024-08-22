import java.util.Scanner;
// import java.lang.*;
public class enc_dec {
     static String enc(String word,int num)
    {  
        char[] arr= new char[word.length()];
        for(int i=0;i<word.length();i++){
            char s=word.charAt(i);
            if(Character.isLowerCase(s)){
                char ch=(char)((s - 'a' + num) % 26 + 'a');
                arr[i]=ch;
            }
            else if(Character.isUpperCase(s)){
                char ch=(char)((s - 'A' + num) % 26 + 'A');
                arr[i]=ch;
            }
            else{
                // System.out.println("enter only string");
                arr[i]=s;
            }
        }
        return new String(arr);
    }
    static String dec(String word,int num)
    {  
        char[] arr= new char[word.length()];
        for(int i=0;i<word.length();i++){
          
             char s=word.charAt(i);
            if(Character.isLowerCase(s)){
                char ch=(char)((s - 'a' - num + 26) % 26 + 'a');
                arr[i]=ch;
            }
            else{
                char ch=(char)((s - 'A' - num + 26) % 26 + 'A');
                arr[i]=ch;
            }
        }
        return new String(arr);
    }
    public static void main(String a[])
    {
        // enc_dec d=new enc_dec();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string and number ");
        String word=sc.nextLine();
        int num= sc.nextInt();
        String encrypted=enc(word,num);
        System.out.println("Encrypted message is "+encrypted);

        String decrypted=dec(encrypted,num);
        System.out.println("Decrypted message is "+decrypted);
        sc.close();
    }  
}
