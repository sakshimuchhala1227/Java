import java.util.Scanner;

class Vote{
 public static void main(String[] a) {
Scanner scanner=new Scanner(System.in);
int Avote=0,Bvote=0,Cvote=0,Dvote=0;
int totalvotes=1;
boolean condition = true;
while(condition)
    {
    System.out.println("\nenter 1 for voting");
    System.out.println("2 for result of individual candidate");
    System.out.println("3 for report ");
    System.out.println("4 for exit");
    int choice = scanner.nextInt();
   
    switch(choice){
       case 1:
       {
        //   if(totalvotes==)
          System.out.println("caste your vote to candidate A(1) , B(2),C(3) or D(4)");
          int vote = scanner.nextInt();
          if(totalvotes%3==0 || totalvotes%7==0)
          vote=3; 
          switch(vote){
            case 1:
            Avote++;
            totalvotes++;
            break;

            case 2:
            Bvote++;
            totalvotes++;
            break;

            case 3:
            Cvote++;
            totalvotes++;
            break;

            case 4:
            Dvote++;
            totalvotes++;
            break;

            default:
            System.out.println("enter the correct character");
          }
        }
        break;

        case 2:
        {
          System.out.println("which candidates result you want A(1) ,B(2) ,C(3) or D(4)");
          int result= scanner.nextInt();
          if(result==1)
            System.out.println("candidate A gets "+Avote+" votes");
          if(result==2)
            System.out.println("candidate B gets "+Bvote+" votes");
          if(result==3)
            System.out.println("candidate C gets "+Cvote+" votes");
          if(result==4)
            System.out.println("candidate D gets "+Dvote+" votes");
        }
        break;

        case 3:
        {
        System.out.print("Their are total four candidates A ,B ,C and D . Here is the report :--- ");
        System.out.println("\ntotal votes are "+(totalvotes-1));
        System.out.println("candidate A gets "+Avote+" votes");
        System.out.println("candidate B gets "+Bvote+" votes");
        System.out.println("candidate C gets "+Cvote+" votes");
        System.out.println("candidate D gets "+Dvote+" votes");
        }
        break;

        case 4:
        condition=false;
        break;

        default:
        System.out.println("please enter the correct number");    
    }
}
scanner.close();
}
}

  // if(N%2==0){
  //           if(N>=2||N<=5) 
  //                     System.out.println("Not Weird");
  //               else if(N>=6||N<=20)
  //                   System.out.println("Weird");
  //               else if(N>20)
  //                   System.out.println("Not Weird");  
  //       }   
  //       else
  //           System.out.println("Weird");