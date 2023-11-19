import java.util.ArrayList;
import java.util.List;

class q4 {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //lists of different types
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Wildcard");
        stringList.add("Example");

        // printing both the lists using wildcard's method
        System.out.println("Printing integerList:");
        printList(integerList);

        System.out.println("Printing stringList:");
        printList(stringList);
    }
}
