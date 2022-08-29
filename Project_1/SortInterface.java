package CMSC_451.Project_1;

public interface SortInterface {
    void recursiveMergeSort(int [] list) throws UnsortedExeption;
    void iterativeMergeSort(int[] list) throws UnsortedExeption;
    int getCount();
    long getTime();
}
