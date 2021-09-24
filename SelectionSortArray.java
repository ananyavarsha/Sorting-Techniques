
public class SelectionSortArray {

    public static void selectionSort(int[] arr, int length) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 1, 10, 8 };
        selectionSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
