/*Write a Java program to execute the following statements. Observe and analyze the outputs.
a. int x =10; b. double x = 10.5; c. double x=10.5;
 double y = x; int y = x; int y = (int) x
 System.out.println(y); System.out.println(y); System.out.println(y);*/
 import java.util.Scanner;
 class analyse {
    public static void main(String[] args) {
        int n;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter option 1,2,3 for the output : ");
        n=c.nextInt();
        switch(n)
        {
            case 1:
            int x1 =10;
            double y1 = x1;
            System.out.println(y1); 
            break;
            case 2:
            //mismatch error
            //double x2 = 10.5; // 
            //int y2 = x2;
            //System.out.println(y2); 
            break;
            case 3:
            double x3=10.5;
            int y3= (int) x3;
            System.out.println(y3); 
            break;
            default:
            c.close();
        }
    
      }
 }

