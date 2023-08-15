
/*Write a java program to search for a value in a 1 dimensional array using for each loop
construct. Assume that the array is initialized at the time of declaration and user enters
the value to be searched on request.(1 mark)
Input: a[]={1,2,3,1,2,1,5,6,7} searchValue= 1
Expected Output : The value is found at locations: a[0] ,a[3],a[5]  */
import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int s, i = 0;
        int[] a = new int[] { 1, 2, 3, 1, 2, 1, 5, 6, 7 };
        System.out.print("Enter the value to be searched : ");
        s = c.nextInt();
        System.out.print("The value is found at locations: ");
        for (int x : a) {
            if (x == s) {
                System.out.print("a[" + i + "] ");
            }
            i++;
        }
    }
}
