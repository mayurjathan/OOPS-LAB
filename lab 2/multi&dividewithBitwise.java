/*Write a Java program to multiply and divide a number by 2 using bitwise operator. [Hint:
use left shift and right shift bitwise operators*/
import java.util.Scanner;
class multi&dividewithBitwise{
public static void main(String args[]){
    int temp=1,result=0,num1,num2;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter any two integer: ");
    num1=scan.nextInt();
    num2=scan.nextInt();
    while(num2<=num1) { 
    num2<<=1;
    temp<<=1;
    }
while(temp>1)
{
    num2>>=1;
temp>>=1;
if(num1>=num2)
{
    num1=num1-num2;
    result=result+temp;
}
}
System.out.println("Division is:"+result);
}
}