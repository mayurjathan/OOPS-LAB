
/*The annual examination results of 3 students are tabulated as follows:-
Roll
No.
Subject
1
Subject
2
Subject
3
Create a class Result with 2D array and 1D array as its data members. And write
methods to perform the following tasks:-
a. Store marks of 3 subjects obtained by 3 students in 2D array
b. To store total marks obtained by each student in 1D array.
c. To find the highest marks in each subject and the roll number of the student who
secured it.
d. To find the student who obtained the highest total mark */
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        int roll[] = new int[100];
        int sub[][] = new int[5][5];
        int sum[] = new int[5];
        int hig[] = new int[5];
        int mark[] = new int[5];
        int i, j, c = 0, temp;
        Scanner sc = new Scanner(System.in);
        for (i = 1; i <= 3; i++) {
            System.out.print("Enter the student " + i + " roll no :");
            roll[i] = sc.nextInt();
        }
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print("Enter the student " + i + " subject " + j + " marks : ");
                sub[i][j] = sc.nextInt();
                sum[i] += sub[i][j];
            }
        }
        for (i = 1; i <= 3; i++) {
            temp = 0;
            for (j = 1; j <= 3; j++) {
                if (sub[i][j] > temp) {
                    temp = sub[i][j];
                    hig[i] = j;
                    mark[i] = sub[i][j];
                }
            }

        }
        temp = 0;
        for (i = 1; i <= 3; i++) {
            if (sum[i] > temp) {
                temp = sum[i];
                c = i;
            }
            System.out.println(
                    "The student " + i + " with roll no " + roll[hig[i]] + " has " + mark[i] + " in subject " + i);
        }
        System.out.println("The student with highest total sum is student " + c + " with " + temp + " marks");
    }

}
