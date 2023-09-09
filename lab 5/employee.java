
/*Define a class Employee with data members: employee name, city, basic salary,
dearness allowance (DA%) and house rent (HRA%). Define getdata(), calculate(),
and display() functions. Calculate method should find the total salary and display
method should display it.
Total = basic+basic*da/100+basic*hra/100; */
import java.util.Scanner;

class employee {
    private String name;
    private String city;
    private double basic;
    private double DA;
    private double HRA;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter City: ");
        city = sc.nextLine();
        System.out.println("Enter Basic Salary: ");
        basic = sc.nextDouble();
        System.out.println("Enter Dearness Allowance (DA%): ");
        DA = sc.nextDouble();
        System.out.println("Enter House Rent Allowance (HRA%): ");
        HRA = sc.nextDouble();
    }

    public double calculate() {
        double Total = basic + basic * DA / 100 + basic * HRA / 100;
        return Total;
    }

    public void display() {
        System.out.println("Total Salary : " + calculate());
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        employee em = new employee();
        em.getdata();
        em.display();
    }
}