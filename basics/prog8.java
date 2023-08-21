// Online Java Compiler
// prime number from 1 to 100


class primenumber {
    public static void main(String[] args) {
       int a,b,c=0;
     for (a=2;a<=100;a++)
     {
      c=0;
      for(b=2;b<=a/2;b++)
      {
          if(a%b==0)
          {
          c=1;
          break;
          }
      }
      if(c==0)
      System.out.print(a+",");
      
  }
} 
    
}