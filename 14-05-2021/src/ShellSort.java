import java.util.Scanner;

public class ShellSort {
 
    public static void main(String[] args) 
    {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements into array");

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        displayNum(arr);
        shellSort(arr,n);
    }

    static void displayNum(int nums[])
    {    
        System.out.println("The given elements are...");
        for(int i = 0 ; i < nums.length ; i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }

    static void shellSort(int[] arr, int num)    
    {    
        for(int gap = num / 2; gap> 0;  gap /= 2)    
        {    
            for(int j = gap; j<num; j++)    
            {    
                for(int i = (j - gap); i>= 0; i -= gap)    
                {    
                    if (arr[i+gap] >= arr[i])    
                        break;    
                    else  
                    {    
                        int temp = arr[i];    
                        arr[i] = arr[i+gap];    
                        arr[i+gap] = temp;    
                    }    
                }    
            }    
        } 
        System.out.println("After sorting, the elements are...");
        for (int x : arr) 
        {
            System.out.print(x+" ");
        }   
    }  

}