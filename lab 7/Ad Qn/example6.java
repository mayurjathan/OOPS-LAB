class example6 {
    static int i;
    static String s;

    static void display() {
        example6 obj1 = new example6();
        System.out.println("i:" + obj1.i);
        System.out.println("i:" + obj1.i);
    }

    void funcn() {
        display();
    }

    public static void main(String args[]) {
        display();
    }
}
// i:0
// i:0 - Output