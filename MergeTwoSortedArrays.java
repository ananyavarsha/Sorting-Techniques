public class MergeTwoSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2, int n, int m) {
        int[] arr3 = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {// if arr2 gets exhausted then this while loop will be executed
            // if size of arr2 is less than arr1 or is equal
            // the leftover elements will be copied into result array.
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {// if arr1 gets exhausted then this while loop will be executed
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 6, 10 };
        int[] arr2 = { 4, 8, 11, 15 };
        int[] arr3 = merge(arr1, arr2, arr1.length, arr2.length);
        for (int p = 0; p < arr3.length; p++)
            System.out.print(arr3[p] + " ");

    }
}
