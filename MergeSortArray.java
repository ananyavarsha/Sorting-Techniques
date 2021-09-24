
public class MergeSortArray {

    public static void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;// traverse left sorted subarray
        int j = mid+1;// traverse right sorted subarry
        int k = low;// will merge both arrays into original array

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 4, 3, 6, 8 };
        sort(arr, new int[arr.length], 0, arr.length - 1);
        for (int p = 0; p < arr.length; p++)
            System.out.print(arr[p] + " ");
    }
}
