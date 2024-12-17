// Find the Kth Largest Element in an Array
import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 34, 2, 99, 23};
        int k = 1;  // Find the 3rd largest element
        
        Arrays.sort(arr);
        System.out.println(k + "th largest element: " + arr[arr.length - k]);
    }
}
