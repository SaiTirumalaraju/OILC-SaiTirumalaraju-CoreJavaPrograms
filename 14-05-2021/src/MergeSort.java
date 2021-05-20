import java.util.Scanner;
 
public class MergeSort {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you want to enter?");
        int n = sc.nextInt();
 
        int arr[] = new int[n];
        System.out.println("enter the elements");
 
        // store that elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        // method to call
        sort(arr, 0, arr.length - 1);
 
        // display the elements
        for (int x : arr) {
            System.out.println(x);
        }
    }
 
    private static void sort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = (i + j) / 2;
            // upto mid
            sort(arr, i, mid);
            // upto last
            sort(arr, mid + 1, j);
            // take merge method
            merge(arr, i, mid, j);
        }
    }
 
    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int b[] = new int[arr.length];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
                k++;
            } else {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        // copy remaining elements if any at left side
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        // copy remaining elements if any at right side
        while (j <= high) {
            b[k] = arr[j];
            j++;
            k++;
        }
        // copy all elements of b into arr
        for (i = low; i <= high; i++) {
            arr[i] = b[i];
        }
    }
 
}