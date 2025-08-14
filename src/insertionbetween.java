public class insertionbetween {
    public static void main(String[] args) {
int[] arr = {13,23,20,34,0};
int n = 5;
int pos = 2;
int element = 10;
        System.out.print("array before insertion");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =n-1;i>=pos;i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos-1]= element;
        System.out.println( "\narray after insertion");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}