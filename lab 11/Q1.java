import java.util.Scanner;

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface is running");
    }
}

// Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class is running");
    }
}

class ThreadCreationMenu {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create Thread using Runnable interface");
            System.out.println("2. Create Thread by extending Thread class");
            System.out.println("3. Exit");
            // System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Creating thread using Runnable interface
                    MyRunnable myRunnable = new MyRunnable();
                    Thread threadUsingRunnable = new Thread(myRunnable);
                    threadUsingRunnable.start();
                    // threadUsingRunnable.join();
                    break;
                case 2:
                    // Creating thread by extending Thread class
                    MyThread myThread = new MyThread();
                    myThread.start();
                    // myThread.join();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}