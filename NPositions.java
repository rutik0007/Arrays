//Rotate an Array by N Positions
public class  NPositions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; 
        
        int length = arr.length;
        n = n % length;  // Handle rotation larger than array size
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, n, length - 1);
        
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
