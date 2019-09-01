//Author: Nico Patalagua
public class HeapSort {
    public static void Sort(int Array[]) {
        int n = Array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(Array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = Array[0];
            Array[0] = Array[i];
            Array[i] = temp;
            Heapify(Array, i, 0);
        }
    }
    public static void Heapify(int Array[], int N, int I) {
        int largest = I;
        int l = 2 * I + 1;
        int r = 2 * I + 2;
        if (l < N && Array[l] > Array[largest]) {
            largest = l;
        }
        if (r < N && Array[r] > Array[largest]) {
            largest = r;
        }
        if (largest != I) {
            int swap = Array[I];
            Array[I] = Array[largest];
            Array[largest] = swap;
            Heapify(Array, N, largest);
        }
    }  
    public static void HeapSort(int Array[]) {
        HeapSort heapSort = new HeapSort();
        heapSort.Sort(Array);
        int n = Array.length;
        System.out.println("Heap Sort:");
        for (int i = 0; i < n; ++i) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort(arr);
    }
}