//Count Occurrences of an Element in an Array
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 2, 5};
        int target = 2;
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("Occurrences of " + target + ": " + count);
    }
}
