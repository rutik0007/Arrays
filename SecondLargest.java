//Find the Second Largest Element in an Array
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 34, 2, 99, 23};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
