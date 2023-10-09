class example2 {
    int num;

    // Static class
    static class X {
        static String str = "Inside Class X";
        int num = 99;// compilation error you have to save it in int
    }

    public static void main(String args[]) {
        example2.X obj = new example2.X();
        System.out.println("Value of num=" + obj.str);
    }
}
// "Value of num=Inside Class X"-Output