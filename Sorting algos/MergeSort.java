public class MergeSort {

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; // Corrected size of temp array
        int left = low, right = mid + 1, i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) { // Use <= for stable sorting
                temp[i++] = arr[left++];
            } else {
                temp[i++] = arr[right++];
            }
        }

        // Copy remaining elements from left subarray
        while (left <= mid) {
            temp[i++] = arr[left++];
        }

        // Copy remaining elements from right subarray
        while (right <= high) {
            temp[i++] = arr[right++];
        }

        // Copy sorted elements from temp back to arr
        for (i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2; // Calculate mid index properly
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {32, 17, 45, 9, 63};
        int low = 0, high = arr.length - 1; // Adjusted high index

        mergeSort(arr, low, high);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
