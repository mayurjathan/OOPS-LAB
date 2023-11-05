// Develop a program for searching a student from a class. Assume a set of 10 students
// with their details as Registration number, First Name, Last Name and Degree in an
// array of Student objects. Search a student either by First Name or Last Name.
import java.util.Scanner;

class Student {
    int roll;
    String firstName, lastName;

    public Student(int roll, String firstName, String lastName) {
        this.roll = roll;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Roll = " + roll + "\nName = " + firstName + " " + lastName + "\n";
    }
}

public class searchstu{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[10];

        println("Enter details of 10 students: ");
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(i + 1, scan.nextLine(), scan.nextLine());
        }

        while (true) {
            println("Search by:\n1. First Name\n2. Last Name\n3. Quit");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume the newline

            if (choice == 3) {
                break; // Exit the program
            }

            print("Enter the name to search: ");
            String name = scan.nextLine();
            boolean found = false;

            for (Student student : students) {
                if (student == null) {
                    continue; // Skip null entries
                }

                if ((choice == 1 && student.firstName.equalsIgnoreCase(name)) ||
                    (choice == 2 && student.lastName.equalsIgnoreCase(name))) {
                    println(student.toString());
                    found = true;
                }
            }

            if (!found) {
                println("Not Found!");
            }
        }
        scan.close();
    }

    static void print(String str) {
        System.out.print(str);
    }

    static void println(String str) {
        System.out.println(str);
    }
}
