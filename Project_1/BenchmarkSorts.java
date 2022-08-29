package CMSC_451.Project_1;

/**
 * BenchmarkSorts
 */
public class BenchmarkSorts {


    public static void main(String[] args) {
        int[] test_array = new int[50];

        for (int i = 0; i < test_array.length; i++ ) {
            test_array[i] = (int) Math.random();
        }

        System.out.println(test_array);
    }
}