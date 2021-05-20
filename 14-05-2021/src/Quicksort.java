import java.util.Arrays;

class Quicksort {
	
	public static void main(String args[]) {

	    int[] array = { 8, 7, 2, 1,6, 0, 9, 6 };
	    System.out.println("Unsorted Array");
	    
	    for(int i=0;i<array.length;i++) {
	    	System.out.print(array[i]+" ");
	    }
	    System.out.println();
	    
	    int size = array.length;

	    quickSort(array, 0, size - 1);

	    System.out.println("Sorted Array in Ascending Order ");
	    
	    for(int i=0;i<array.length;i++) {
	    	System.out.print(array[i]+" ");
	    }
	  }

  static int partition(int array[], int low, int high) {
    
    int pivot = array[high];
    
    int i = (low - 1);


    for (int j = low; j < high; j++) {
      if (array[j] < pivot) {

        i++;

        // swapping element at i with element at j
        swap(array,i,j);
      }

    }

    swap(array,i+1,high);

    // return the position from where partition is done
    return (i + 1);
  }

  private static void swap(int array[],int i, int j) 
  {
	  int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
}

static void quickSort(int array[], int low, int high) {
    if (low <= high) 
    {

      int pi = partition(array, low, high);
      
      quickSort(array, low, pi - 1);

      quickSort(array, pi + 1, high);
    }
  }


  
}