class example4 {
    static int num;
    static String mystr;

    static {
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }

    static {
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }

    public static void main(String args[]) {
        System.out.println("Value of num=" + num);
        System.out.println("Value of mystr=" + mystr);
    }
}
// Static Block 1
// Static Block 2
// Value of num=98
// Value of mystr=Block2 -Output
