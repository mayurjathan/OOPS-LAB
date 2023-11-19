//generic linked list
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while(true){
            System.out.println("0. Exit, 1. Add at end, 2. Delete at end, 3. display");
            int choice = scan.nextInt();
            switch(choice){
                case 0: return;
                case 1: 
            }
        }
    }
}

class LinkedList<T>{
    Node<T> head;
    LinkedList(){
        head = null;
    }
    public void add(T data){
        Node<T> newNode = new Node<T>(data, null);
        if(isEmpty()){
            head= newNode;
        }
        //find last node
        Node<T> lastNode = head;
        
        //add newly created node to its next
        lastNode.next = newNode;
    }
    public void remove(){
        if(isEmpty())
            return;

        //find last element

        //remove that element
    }
    public boolean hasNext(){
        return()
    }

    public T next(){

    }

    public boolean isEmpty(){
        return (this.head==null);
    }
    @Override
    public String toString(){
        if (isEmpty())
            return null;
        String result = new String("[");

        result+="]";
        return result;
    }
}

class Node<T>{
    T data;
    Node<T> next;
    Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}