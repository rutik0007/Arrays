public class Min {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 2};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}
