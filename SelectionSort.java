//Author: Nico Patalagua
public class SelectionSort {
    public static void SelectionSort(int Array[]) {
        for (int i = 0; i < Array.length - 1; i++) {
            int Aux = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[Aux]) {
                    Aux = j;
                }
            }
            int Minimun = (int) Array[Aux];
            Array[Aux] = Array[i];
            Array[i] = Minimun;
        }
        System.out.println("Selection Sort:");
        for (int i = 0; i < Array.length; i++) {
            int n = (int) Array[i];
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        SelectionSort(arr);
    }
}