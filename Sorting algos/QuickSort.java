public class QuickSort {
    static int partition(int [] arr,int start, int end){
        int i=start+1,j=end,pivIndex=start,pivot=arr[pivIndex];
        while(i<=j){
            while(i<=j&&arr[i]<pivot)i++;

            while(i<=j&&arr[j]>pivot)j--;

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Swap pivot with arr[j]
        //  since i and j crossed each other i.e i>j now we swap pivot with arr[j] and j is correct index of pivot so we return j
        if (pivIndex != j) {
            int temp = arr[pivIndex];
            arr[pivIndex] = arr[j];
            arr[j] = temp;
        }

        return j; // Return the pivot index
    }

    static void quickSort(int [] arr,int start,int end) {
        if (start < end) {
            int pivIndex = partition(arr, start, end);
            quickSort(arr, start, pivIndex - 1);
            quickSort(arr, pivIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int []arr={8,3,11,6,2};
        quickSort(arr,0,(arr.length-1));
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
