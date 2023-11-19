// //generic linked list
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args) {
//         while(true){
//             var scan=new Scanner(System.in);
//             System.out.println("0. Exit, 1. Add at end, 2. Delete at end, 3. display");
//             int choice = scan.nextInt();
//             switch(choice){
//                 case 0: return;
//                 case 1: 
//             }
//         }
//     }
// }

// class LinkedList<T>{
//     Node<T> head;
//     LinkedList(){
//         head = null;
//     }
//     public void add(T data){
//         Node<T> newNode = new Node<T>(data, null);
//         if(isEmpty()){
//             head= newNode;
//         }
//         //find last node
//         Node<T> lastNode = head;
        
//         //add newly created node to its next
//         lastNode.next = newNode;
//     }
//     public void remove(){
//         if(isEmpty())
//             return;

//         //find last element

//         //remove that element
//     }
//     public boolean hasNext(){
//         return();
//     }

//     public T next(){

//     }

//     public boolean isEmpty(){
//         return (this.head==null);
//     }
//     @Override
//     public String toString(){
//         if (isEmpty())
//             return null;
//         String result = new String("[");

//         result+="]";
//         return result;
//     }
// }

// class Node<T>{
//     T data;
//     Node<T> next;
//     Node(T data, Node<T> next){
//         this.data = data;
//         this.next = next;
//     }
// }
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        LinkedList<Double> doubleList = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("0. Exit, 1. Add at end (Integer), 2. Add at end (Double), 3. Display (Integer), 4. Display (Double)");
            int choice = scan.nextInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.print("Enter integer data to add: ");
                    int intData = scan.nextInt();
                    intList.add(intData);
                    break;
                case 2:
                    System.out.print("Enter double data to add: ");
                    double doubleData = scan.nextDouble();
                    doubleList.add(doubleData);
                    break;
                case 3:
                    System.out.println("Integer Linked List: " + intList);
                    break;
                case 4:
                    System.out.println("Double Linked List: " + doubleList);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

class LinkedList<T> {
    Node<T> head;

    LinkedList() {
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            // Find the last node
            Node<T> lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            // Add the newly created node to its next
            lastNode.next = newNode;
        }
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");

        return result.toString();
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
