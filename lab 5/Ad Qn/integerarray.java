
/*Create a class with integer array of size 10 and write methods to perform following:-
a. Input values into an array
b. Display the values
c. Display the largest value
d. Display the average
e. Sort the array in ascending order */
import java.util.Scanner;

class integerarray {
    int i, j, temp;

    public static void main(String[] args) {
        int i, j;
        int size;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.print("Enter the array size : ");
        size = sc.nextInt();
        System.out.print("Input values into an array : ");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }
        integerarray ob = new integerarray();
        ob.display(a, size);
        ob.largest(a, size);
        ob.average(a, size);
        ob.sort(a, size);
    }

    void display(int a[], int size) {
        System.out.print("Display the values : ");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }

    void largest(int a[], int size) {
        temp = 0;
        System.out.print("\nThe largest value is : ");
        for (i = 0; i < size; i++) {
            if (temp < a[i])
                temp = a[i];
        }
        System.out.print(temp);
    }

    void average(int a[], int size) {
        temp = 0;
        System.out.print("\nThe Average value is : ");
        for (i = 0; i < size; i++) {
            temp = a[i] + temp;
        }
        System.out.print(temp);
    }

    void sort(int a[], int size) {
        System.out.print("\nThe Sorted array is : ");
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                temp = 0;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
