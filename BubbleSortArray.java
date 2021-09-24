
public class BubbleSortArray {

    public static void bubbleSort(int[] arr, int n) {
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false)// the array is already sorted if isSwapped is false
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 2, 10 };
        bubbleSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
