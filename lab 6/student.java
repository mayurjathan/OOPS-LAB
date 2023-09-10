/*. Create a base class for student having registration number, name and age. 
From this class create two new class UG and PG student with semester
and fees as its data members. 
Use proper member function for demonstrating inheritance. 
Display the details of students who took admission to UG course and PG course separately,
 total number of UG admissions and PG admissions. */
import java.util.Scanner;
class StudentDemo{
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        Student[] students = new Student[100];
        for(int i=0; i<100; i++) students[i] = null;
        String studentChoice, choice;
        int ug=0, pg=0;
        int i=0;
        do{
            System.out.println("which student? (ug/pg) ");
            studentChoice = scan.next();
            if (studentChoice.equals("ug")){
                ug++;
                {
                    int roll;
                    String name;
                    int age;
                    int semester;
                    int fees;
                    System.out.println("Registration Number: ");
                    roll = scan.nextInt();
                    System.out.println("Name: ");
                    name = scan.next();
                    System.out.println("Age: ");
                    age = scan.nextInt();
                    System.out.println("Semester: ");
                    semester = scan.nextInt();
                    System.out.println("Fees: ");
                    fees = scan.nextInt();

                    students[i] = new UGStudent(roll, name, age, semester, fees);
                }
            }

            else if (studentChoice.equals("pg")){
                pg++;
                {
                    int roll;
                    String name;
                    int age;
                    int semester;
                    int fees;
                    System.out.println("Registration no.: ");
                    roll = scan.nextInt();
                    System.out.println("Name: ");
                    name = scan.next();
                    System.out.println("Age: ");
                    age = scan.nextInt();
                    System.out.println("Semester: ");
                    semester = scan.nextInt();
                    System.out.println("Fees: ");
                    fees = scan.nextInt();

                    students[i] = new PGStudent(roll, name, age, semester, fees);
                }
            }
            else System.out.println("Invalid Choice!");
            System.out.println("Another student? (y/n) ");
            choice = scan.next();
            i++;
        }while(!choice.equals("n"));

        System.out.println("Number of UG Students = " + ug);
        System.out.println("Number of PG Students = " + pg);

        //display all students
        i=0;
        while(students[i]!=null){
            students[i].display();
            i++;
        }
    }
}

class Student{
    int roll;
    String name;
    int age;
    Student(){}
    Student(int roll, String name, int age){
        this.roll = roll;
        this.name = new String(name);
        this.age = age;
    }
    void display(){
        System.out.println("Registration Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UGStudent extends Student{
    int semester;
    int fees;
    UGStudent(){}
    UGStudent(int semester, int fees){
        super();
        this.semester = semester;
        this.fees = fees;
    }
    UGStudent(int roll, String name, int age, int semester, int fees){
        super(roll, name, age);
        this.semester = semester;
        this.fees = fees;
    }
    void display(){
        super.display();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

class PGStudent extends Student{
    int semester;
    int fees;
    PGStudent(){}
    PGStudent(int semester, int fees){
        super();
        this.semester = semester;
        this.fees = fees;
    }
    PGStudent(int roll, String name, int age, int semester, int fees){
        super(roll, name, age);
        this.semester = semester;
        this.fees = fees;
    }
    void display(){
        super.display();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}