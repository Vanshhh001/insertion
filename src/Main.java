public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50,0, 0};
        int n = 5;
        int element = 55;
        System.out.println("array before insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = element;
        System.out.println("\narray after insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}