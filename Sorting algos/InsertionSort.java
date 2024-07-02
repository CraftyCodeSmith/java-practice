public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int [] arr={13,46,24,52,20,9};
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>0;j--){

               if(arr[j]>arr[i]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }

               if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
