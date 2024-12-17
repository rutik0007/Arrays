//Check if a Number Exists in an Array
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        
        boolean exists = false;
        for (int num : arr) {
            if (num == target) {
                exists = true;
                break;
            }
        }
        
        System.out.println("Number " + target + " exists in the array: " + exists);
    }
}

