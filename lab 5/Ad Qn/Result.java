
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

class Result {
    private int[] roll;
    private int[][] sub;
    private int[] sum;
    private int[] hig;
    private int[] mark;
    private int topStudent;

    public Result() {
        roll = new int[4]; // Increased the size to 4 to match the index range.
        sub = new int[4][4]; // Increased the size to 4x4 to match the index range.
        sum = new int[4];
        hig = new int[4];
        mark = new int[4];
        topStudent = 0;
    }

    public void inputStudentData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the student " + i + " roll no: ");
            roll[i] = sc.nextInt();
            for (int j = 1; j <= 3; j++) {
                System.out.print("Enter the student " + i + " subject " + j + " marks: ");
                sub[i][j] = sc.nextInt();
                sum[i] += sub[i][j];

                if (sub[i][j] > mark[i]) {
                    mark[i] = sub[i][j];
                    hig[i] = j;
                }
            }
        }
    }

    public void findStudentWithHighestTotal() {
        int temp = 0;
        for (int i = 1; i <= 3; i++) {
            if (sum[i] > temp) {
                temp = sum[i];
                topStudent = i;
            }
        }
    }

    public void displayResults() {
        // Display total marks for each student
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + roll[i] + " - Total Marks: " + sum[i]);
        }
    
        // Display highest marks in each subject
        for (int j = 1; j <= 3; j++) {
            int highestSubjectMark = 0;
            int studentWithHighestSubjectMark = 0;
    
            for (int i = 1; i <= 3; i++) {
                if (sub[i][j] > highestSubjectMark) {
                    highestSubjectMark = sub[i][j];
                    studentWithHighestSubjectMark = i;
                }
            }
    
            System.out.println("Highest marks in Subject " + j + " - Student " + roll[studentWithHighestSubjectMark] +
                    " (Marks: " + highestSubjectMark + ")");
        }
    
        // Display the student with the highest total marks
        System.out.println("The student with the highest total marks - Student " + roll[topStudent] +
                " (Total Marks: " + sum[topStudent] + ")");
    }
    

    public static void main(String[] args) {
        Result result = new Result();
        result.inputStudentData();
        result.findStudentWithHighestTotal();
        result.displayResults();
    }
}

