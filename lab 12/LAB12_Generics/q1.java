import java.util.*;

class q1 {
    public static void main(String[] args) {
        // create an array of integers 
        Integer[] intArray = {1, 2, 3, 4, 5}; 
        System.out.println(Arrays.toString(intArray));
 
        // exchange the elements at positions 1 and 3 
        exchange(intArray, 1, 3); 
 
        // print the updated array 
        System.out.println(Arrays.toString(intArray));
    }   
    
    public static <T> void exchange(T[] arr, int i, int j) { 
        T temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }
}
