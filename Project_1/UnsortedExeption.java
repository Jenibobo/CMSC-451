package CMSC_451.Project_1;

/**
 * UnsortedExeption
 */
public class UnsortedExeption extends Exception {

    public boolean checkSorted(int[] list, int n) throws Exception{
        boolean isSorted = false;

        if (n == 1 || n == 0) {
            isSorted = true;
        }

        while (!isSorted) {
            isSorted = false;
            if (list[n - 1] < list[n - 2]) {
                isSorted = false;
            }
            checkSorted(list, n);
        }
        return isSorted;
    }
}
