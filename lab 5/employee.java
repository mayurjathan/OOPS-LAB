import java.util.Scanner;

class Employee {
    String name;
    String city;

    float basicSalary;
    float houseRent;
    float da;
    float hra;

    private float totalSalary;

    void getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        name = sc.nextLine();
        System.out.println("Enter employee city:");
        city = sc.nextLine();

        System.out.println("Enter basic Salary:");
        basicSalary = sc.nextFloat();
        System.out.println("Enter house rent:");
        houseRent = sc.nextFloat();
        System.out.println("Enter dearness allowance:");
        da = sc.nextFloat();
        System.out.println("Enter HRA:");
        hra = sc.nextFloat();
        sc.close();
    }

    float calculate()
    {
        totalSalary = (basicSalary + basicSalary * da/100 + basicSalary * hra/100 );
        return totalSalary;
    }

    void display()
    {
        System.out.println("Total salary: " + calculate());
    }
}

class Company
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getData();
        emp.display();
    }
}