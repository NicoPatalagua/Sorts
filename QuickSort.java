//Author: Nico Patalagua
public class QuickSort {
    public static void Sort(int Array[], int Left, int Right) {
        int Pivot = Array[Left];
        int i = Left;
        int j = Right;
        int Aux;
        while (i < j) {
            while (Array[i] <= Pivot && i < j) {
                i++;
            }
            while (Array[j] > Pivot) {
                j--;
            }
            if (i < j) {
                Aux = Array[i];
                Array[i] = Array[j];
                Array[j] = Aux;
            }
        }
        Array[Left] = Array[j];
        Array[j] = Pivot;
        if (Left < j - 1) {
            Sort(Array, Left, j - 1);
        }
        if (j + 1 < Right) {
            Sort(Array, j + 1, Right);
        }
    }
    public static void QuickSort(int Array[]) {
        QuickSort quickSort = new QuickSort();
        int n = Array.length;
        quickSort.Sort(Array, 0, (n - 1));
        System.out.println("Quick Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        QuickSort(arr);
    }
}