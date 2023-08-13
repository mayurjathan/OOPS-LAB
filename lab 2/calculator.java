/*Create the equivalent of a four-function calculator. The program should request the user to
enter a number, an operator, and another number. (Use floating point.) It should then carry
out the specified arithmetic operation: adding, subtracting, multiplying, or dividing the two
numbers. Use a switch statement to select the operation. Finally, display the result. When
it finishes the calculation, the program should ask if the user wants to do another calculation.
The response can be 'y' or 'n'. [Hint: use do-while loop]
Example
Enter first number, operator, second number: 10 / 3
Answer = 3.333333
Do another (y/n)? n */
import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        float n1,n2,t;
        char y,o;
        while (true) {
        System.out.print("Enter first number : ");
        n1=c.nextFloat();
         System.out.print("Enter second number : ");
         n2=c.nextFloat();
         System.out.print("Enter the operator : ");
         o=c.next().charAt(0);
         switch(o)
         {
            case '+':
            t=n1+n2;
            System.out.println("Answer  = "+t);
            break;
            case '-':
            t=n1-n2;
            System.out.println("Answer = "+t);
            break;
            case '*':
            t=n1*n2;
            System.out.println("Answer = "+t);
            break;
            case '/':
            t=n1/n2;
            System.out.println("Answer = "+t);
            break;
            default:
            System.out.println("ERROR");
            break;
         }
         System.out.println("Do another (y/n)?");
         y= c.next().charAt(0);
        if(y == 'n' || y == 'N') break;
        }
    } 
}
