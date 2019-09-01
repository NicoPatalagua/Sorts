//Author: Nico Patalagua
public class InsertionSort {
    public static void InsertionSort(int[] Array) {
        int Aux;
        for (int i = 1; i < Array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (Array[j] < Array[j - 1]) {
                    Aux = (int) Array[j];
                    Array[j] = Array[j - 1];
                    Array[j - 1] = Aux;
                }
            }
        }
        System.out.println("Insertion Sort:");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        InsertionSort(arr);
    }
}