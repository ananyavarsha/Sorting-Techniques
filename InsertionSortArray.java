
public class InsertionSortArray {

    public static void insertionSort(int[] arr, int length) {

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 10, 5, 4, 6, 7 };
        insertionSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
