package CMSC_451.Homework;

public class hw_1 {
     // Problem #1
     static int pentagonal (int n) { 
        int result = 0; 
        for (int i = 1; i <= n; i++) 
            result += 3 * i - 2; 
        return result; 
    }

    static int rec_pentagonal (int n) {
        if (n == 1)
	        return 1;
        return (rec_pentagonal(n - 1) + 3 * n - 2);
    }

    static int recursiveBinarySearch (int[] array, int target, int left, int right) { 
        System.out.println(array.length);

        if (left > right) 
            return -1; 
        int middle = (left + right) / 2; 
        if (array[middle] == target) 
            return middle; 
        if (array[middle] > target)
            return recursiveBinarySearch(array, target, left, middle - 1); 
        return recursiveBinarySearch(array, target, middle + 1, right); 
    }
    public static void main(String[] args) {
        // System.out.println(pentagonal(100));
        // System.out.println(rec_pentagonal(100));

        int arr[] = {0};
        int target = 0;
        int left = 0;
        int right = 0;

        System.out.println(recursiveBinarySearch(arr, target, left, right));
    }
}
