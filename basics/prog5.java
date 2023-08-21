// Online Java Compiler
// FIBBONACI series

class fibbonaci {
    public static void main(String[] args) {
       int a=5,b,n1=0,n2=1,n3;
       System.out.print(n1+","+n2);
       for(b=2;b<a;b++)
       {
           n3=n1+n2;
           System.out.print(","+n3);
           n1=n2;
           n2=n3;
       }
    }
}