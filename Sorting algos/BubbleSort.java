public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int [] arr={13,46,24,52,20,9};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

//int this we are shifting heaviest element in last and reducing traversal range by 1 from last of array