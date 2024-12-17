//Find the Maximum Difference Between Two Elements in an Array
public class DifferenceBetween {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 8, 7, 9};
        int minElement = arr[0];
        int maxDifference = Integer.MIN_VALUE;
        
        for (int num : arr) {
            maxDifference = Math.max(maxDifference, num - minElement);
            minElement = Math.min(minElement, num);
        }
        
        System.out.println("Maximum Difference: " + maxDifference);
    }
}
