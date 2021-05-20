import java.util.*;
public class FindMaximum {
    static int findMax(int[] arr) {
        int biggest = 0;
        int count = 0;
        if(arr == null) {
            biggest = 0;
        }
        else {
            for(int i = 0;i < arr.length;i++) {
                if(arr[i] < 0) {
                    count++;
                }
                else if(biggest < arr[i]) {
                    biggest = arr[i];
                }
            }
        
            if(count < 3) {
                biggest = -1;
            }
        }
        
        return biggest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
         System.out.println("enter Array values");
        for(int i = 0;i < size;i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(findMax(arr));
    }
}