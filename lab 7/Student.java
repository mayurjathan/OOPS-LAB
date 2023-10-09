
/*
 * Write a java program to store student record of college named MIT. Class
 * Student_Detail should contain name, id, college_name as its
 * members.display_details() method should display the details of the students.
 */
import java.util.Scanner;

class Student_Details {
    String name, colname;
    int id;
    char ch;
    int i = 0;

    Student_Details(String name, String colname, int id) {
        this.name = name;
        this.colname = colname;
        this.id = id;
    }

    void display_details() {
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("College Name : " + colname);
    }
}

class student {
    public static void main(String[] args) {
        String name, colname;
        int id;
        char ch;
        int i = 0;
        Student_Details[] students = new Student_Details[100];
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student Name : ");
            name = sc.next();
            System.out.println("Enter Student ID : ");
            id = sc.nextInt();
            System.out.println("Enter College Name : ");
            colname = sc.next();
            students[i] = new Student_Details(name, colname, id);
            System.out.println("Add one more student (y/n): ");
            ch = sc.next().charAt(0);
            i++;
        } while (ch != 'n');
        i = 0;
        while (students[i] != null) {
            students[i].display_details();
            i++;
        }

    }
}
