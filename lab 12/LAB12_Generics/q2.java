import java.util.ArrayList;

class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student - Name: " + name + ", ID: " + id;
    }
}

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee - Name: " + name + ", Employee ID: " + employeeId;
    }
}

class q2 {
    public static void main(String[] args) {
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("sid", 101));
        studentStack.push(new Student("kid", 102));
        studentStack.push(new Student("qwid", 103));
        System.out.println("Students: ");
        while (!studentStack.isEmpty()) {
            System.out.println("Popped: " + studentStack.pop());
        }
        
        System.out.println();
        System.out.println("Employees: ");
        
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("sam", 201));
        employeeStack.push(new Employee("elon", 202));
        employeeStack.push(new Employee("bill", 203));
        
        while (!employeeStack.isEmpty()) {
            System.out.println("Popped: " + employeeStack.pop());
        }
    }
}