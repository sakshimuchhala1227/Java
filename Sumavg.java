class Sumavg{
     
   public static void main(String a[]) {
    float sum=0;
    for(int x=0;x<a.length;x++){
      sum=Float.parseFloat(a[x])+sum;
    }
    System.out.println("sum is "+sum);
    System.out.println("average is "+(sum)/a.length);
    System.out.println("count is "+a.length);
   }
}