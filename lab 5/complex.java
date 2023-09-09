/*Create a complex class. Use method overloading to find the sum.
add(integer, complex number)
add(complex number, complex number) */
class complex {
    double real;
    double img;

    complex() {
    }

    complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public complex add(int i, complex c) {
        complex t = new complex();
        t.real = i + c.real;
        t.img = c.img;
        return t;
    }

    public complex add(complex c1, complex c2) {
        complex t = new complex();
        t.real = c1.real + c2.real;
        t.img = c1.img + c2.img;
        return t;
    }

    public void display(complex c) {
        System.out.println(c.real + " + " + c.img + "i");
    }
}

class ComplexDemo {
    public static void main(String[] args) {
        complex c1 = new complex(5, 10);
        complex c2 = new complex(11, 22);
        int i = 10;
        c1.display(c1.add(i, c1));
        c1.display(c1.add(c1, c2));
    }
}