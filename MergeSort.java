//Author: Nico Patalagua
public class MergeSort {
    public static void Sort(int Array[], int Left, int Right) {
        if (Left < Right) {
            int Middle = (Left + Right) / 2;
            Sort(Array, Left, Middle);
            Sort(Array, Middle + 1, Right);
            Merge(Array, Left, Middle, Right);
        }
    }
    public static void Merge(int Array[], int Left, int Middle, int Right) {
        int i, j, k;
        int[] Aux = new int[Array.length];
        for (i = Left; i <= Right; i++) {
            Aux[i] = Array[i];
        }
        i = Left;
        j = Middle + 1;
        k = Left;
        while (i <= Middle && j <= Right) {
            if (Aux[i] <= Aux[j]) {
                Array[k++] = Aux[i++];
            } else {
                Array[k++] = Aux[j++];
            }
        }
        while (i <= Middle) {
            Array[k++] = Aux[i++];
        }
    }
    public static void MergeSort(int Array[]) {
        MergeSort mergeSort = new MergeSort();
        int n = Array.length;
        mergeSort.Sort(Array, 0, (n - 1));
        System.out.println("Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        MergeSort(arr);
    }
}