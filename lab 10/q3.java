import java.util.Scanner;
class q3{
    public static void main(String[] args) {
        System.out.println(Student.readStudent());
    }
}

class Student{
    String name;
    int roll;
    int[] marks;
    double percentage;
    char grade;
    Student(){
    }
    Student(String name, int roll, int[] marks){
        this.name = name;
        this.marks = marks.clone();
        this.roll = roll;
    }
    public static Student readStudent(){
        System.out.print("Enter name and roll: ");
        var scan = new Scanner(System.in);
        try{
            String name = scan.nextLine();
            int roll = Integer.parseInt(scan.nextLine());
            System.out.print("Enter no. of subjects: ");
            int m = Integer.parseInt(scan.nextLine());
            int marks[] = new int[m];
            System.out.print("Enter marks: ");
            int total=0;
            for(int i=0; i<m; i++){
                marks[i] = Integer.parseInt(scan.nextLine());
                total +=marks[i];
            }
            Student student = new Student(name, roll, marks);
            student.percentage = total/m;
            switch((int)(student.percentage/10)){
                case 10: student.grade = 'A';  break;
                case 9: student.grade = 'B'; break;
                case 8: student.grade = 'C'; break;
                case 7: student.grade = 'D'; break;
                case 6: student.grade = 'E'; break;
                case 5: student.grade = 'F'; break;
                default: student.grade = 'F'; break;
            }
            return student;
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number entered!");
            return null;
        }
        
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nRoll: " + roll + "\nPercentage: " + percentage + "\nGrade: " + grade;
    }
}
