// Online Java Compiler
// palindrome

class palindrome {
    public static void main(String[] args) {
        int a=10101,sum=0,rev,c;
        c=a;
        while (a!=0)
        {
            rev=a%10;
            sum=(sum*10)+rev;
            a=a/10;
        }
        if(c==sum)
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
    }
}