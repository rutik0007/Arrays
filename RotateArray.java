public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; // Number of positions to rotate
        int length = arr.length;
        // Rotate right by n positions
        int[] rotated = new int[length];
        for (int i = 0; i < length; i++) {
            rotated[(i + n) % length] = arr[i];
        }
        System.out.print("Array after rotation: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
