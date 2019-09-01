//Author: Nico Patalagua
public class BubbleSort {
    public static void BubbleSort(int Array []) {
        for (int i = 0; i < Array .length - 1; i++) {
            for (int j = 0; j < Array .length - 1; j++) {
                if (Array [j] >= Array [j + 1]) {
                    int Aux = Array [j];
                    Array [j] = Array [j + 1];
                    Array [j + 1] = Aux;
                }
            }
        }
        System.out.println("Bubble Sort:");
        for (int i = 0; i < Array .length; i++) {
            System.out.print(Array [i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        BubbleSort(arr);
    }
}