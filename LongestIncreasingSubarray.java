public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 6};
        
        int maxLength = 1, currentLength = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        
        maxLength = Math.max(maxLength, currentLength);
        System.out.println("Longest Increasing Subarray Length: " + maxLength);
    }
}
