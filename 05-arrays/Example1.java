// Problem : Rotates an array 
import java.util.Arrays;

public class Example1 {
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     int k = 2; // Number of rotations

    //     // Rotate the array
    //     rotateArrayRight(arr, k);

    //     // Print the rotated array
    //     System.out.println("Rotated Array: " + Arrays.toString(arr));
    // }

    // public static void rotateArrayRight(int[] arr, int k) {
    //     int n = arr.length;
    //     k = k % n; // Handle cases where k > n
    //     reverse(arr, 0, n - 1);
    //     reverse(arr, 0, k - 1);
    //     reverse(arr, k, n - 1);
    // }

    // private static void reverse(int[] arr, int start, int end) {
    //     while (start < end) {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }
    public static void rotate(int A[] , int k){
        int data;
        for(int j=0; j<k; j++){
            int n =5;
            data = A[n-1];
            for(int i=n-1; i>0; i--){
                A[i] = A[i-1];
            }
            A[0] =data;
        }
    }
    public static void main(String[] args) {
      int[] A ={3,10,2,5,8};
      int k = 3;

      rotate(A,k);

      System.out.println("Rotated Array: " + Arrays.toString(A));
      
    }
}
