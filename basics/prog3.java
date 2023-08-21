// Online Java Compiler
// check whether the number is prime or not 

class prime {
  public static void main(String[] args) {
      int a =13,b,c=0;
      for(b=2;b<=a/2;b++)
      {
          if(a%b==0)
          {
          c=1;
          break;
          }
      }
      if(c==1)
      System.out.println("Not prime");
      else
      System.out.println("prime");
  }
}