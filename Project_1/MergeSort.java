package CMSC_451.Project_1;

/**
 * MergeSort Algorithims
 * 
 */
public class MergeSort {

    /*
     *********** Recursive iterativeMerge Sort *********** 
    */
    public static void recursiveMergeSort(int[] array) {
        if(array == null) {
            return;
        }
  
        if(array.length > 1) {
            int mid = array.length / 2;
  
            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
              
            // Split right part
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
            recursiveMergeSort(left);
            recursiveMergeSort(right);
  
            int i = 0;
            int j = 0;
            int k = 0;
  
            // iterativeMerge left and right arrays
            while(i < left.length && j < right.length) {
                if(left[i] < right[j])
                {
                    array[k] = left[i];
                    i++;
                }
                else
                {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }

    /*
     *********** Iterative iterativeMerge Sort *********** 
    */
    public static void iterativeMergeSort(int arr[], int n) {
          
        // For current size of subarrays to
        // be iterativeMerged curr_size varies from 
        // 1 to n/2
        int curr_size; 
                      
        // For picking starting index of 
        // left subarray to be iterativeMerged
        int left_start;
                          
          
        // iterativeMerge subarrays in bottom up 
        // manner. First iterativeMerge subarrays 
        // of size 1 to create sorted 
        // subarrays of size 2, then iterativeMerge
        // subarrays of size 2 to create 
        // sorted subarrays of size 4, and
        // so on.
        for (curr_size = 1; curr_size <= n-1; curr_size = 2*curr_size) {
              
            // Pick starting point of different
            // subarrays of current size
            for (left_start = 0; left_start < n-1; left_start += 2*curr_size) {
                // Find ending point of left 
                // subarray. mid+1 is starting 
                // point of right
                int mid = Math.min(left_start + curr_size - 1, n-1);
          
                int right_end = Math.min(left_start + 2*curr_size - 1, n-1);
          
                // iterativeMerge Subarrays arr[left_start...mid]
                // & arr[mid+1...right_end]
                iterativeMerge(arr, left_start, mid, right_end);
            }
        }
    }

    /* Function to iterativeMerge the two haves arr[l..m] and
    arr[m+1..r] of array arr[] */
    static void iterativeMerge(int arr[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
      
        /* create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
      
        /* Copy data to temp arrays L[]
        and R[] */
        for (i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[m + 1+ j];
        }
        /* iterativeMerge the temp arrays back into
        arr[l..r]*/
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy the remaining elements of 
        L[], if there are any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy the remaining elements of
        R[], if there are any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}