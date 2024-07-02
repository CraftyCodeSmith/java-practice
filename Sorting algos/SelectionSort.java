public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int [] arr={13,46,24,52,20,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j])
               {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
//int this arr[i] is comapared with rest of elements in arr
