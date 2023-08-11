/*Write a Java program to find whether a given year is leap or not using boolean data type.
[Hint: leap year has 366 days;]
Algorithm:
if (year is not exactly divisible by 4) then (it is a common year)
else
if (year is not exactly divisible by 100) then (it is a leap year)
else
if (year is not exactly divisible by 400) then (it is a common year)
else (it is a leap year)*/
import java.util.Scanner;
class leapyear {
    public static void main(String[] args) {
int y;
boolean b=false;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the year : ");
    y=s.nextInt();
    if(y%4==0){
    if(y%100==0)
    {
    if(y%400==0)
       b=true;
    else
         b=false;
    }
    else 
    b=true;
    }
    else
    b=false;
    if(b)
    System.out.println("It is a leap year");
    else
    System.out.println("It is a common year");
    }
}