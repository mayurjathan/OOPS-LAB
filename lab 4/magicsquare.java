import java.util.Scanner;

class magicsquare {
    public static void main(String[] args) {
        int i, j, sum1 = 0, sum2 = 0;
        boolean flag = false;
        int array[][] = new int[5][5];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = s.nextInt();
        System.out.println("Enter matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                array[i][j] = s.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            sum1 += array[i][i];
            sum2 += array[i][r - 1 - i];
        }
        if (sum1 != sum2)
            flag = true;
        for (i = 0; i < r; i++) {

            // Initialising and declaring the rows and columns sum as 0
            int rowSum = 0, colSum = 0;

            // finding the sum of the rows and columns i.e. row and column
            for (j = 0; j < c; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
            }
            if (rowSum != colSum || colSum != sum1)
                flag = true;
        }
        if (!flag)
            System.out.println("Given matrix is a Magic Square");
        else
            System.out.println("Given matrix is a not a magic" + " Square");
    }
}
