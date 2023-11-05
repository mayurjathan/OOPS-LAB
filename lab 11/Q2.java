class Matrix implements Runnable {
    private int[][] matrix;

    Matrix() {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        this.matrix = m;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();

        if (currentThread.getName().equals("DisplayThread")) {
            displayMatrix();
        } else if (currentThread.getName().equals("TransposeThread")) {
            displayTranspose();
        } else if (currentThread.getName().equals("MaxValueThread")) {
            displayMaxValue();
        } else if (currentThread.getName().equals("PrincipalDiagonalThread")) {
            displayPrincipalDiagonal();
        } else if (currentThread.getName().equals("NonDiagonalThread")) {
            displayNonDiagonal();
        }
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
        }
    }

    private void displayMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(" ");
        }
    }

    private void displayTranspose() {
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }

    private void displayMaxValue() {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println("Maximum value in the matrix: " + max);
    }

    private void displayPrincipalDiagonal() {
        System.out.println("Principal Diagonal elements:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    private void displayNonDiagonal() {
        System.out.println("Non-Diagonal elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}

class MatrixDemo {
    public static void main(String[] args) throws InterruptedException {
        Matrix m1 = new Matrix();

        Thread displayThread = new Thread(m1, "DisplayThread");
        Thread transposeThread = new Thread(m1, "TransposeThread");
        Thread maxValueThread = new Thread(m1, "MaxValueThread");
        Thread principalDiagonalThread = new Thread(m1, "PrincipalDiagonalThread");
        Thread nonDiagonalThread = new Thread(m1, "NonDiagonalThread");

        displayThread.start();
        displayThread.join();
        transposeThread.start();
        transposeThread.join();
        maxValueThread.start();
        maxValueThread.join();
        principalDiagonalThread.start();
        principalDiagonalThread.join();
        nonDiagonalThread.start();
        nonDiagonalThread.join();
    }
}
