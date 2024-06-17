public class SelectionSort {
    //To print array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[idx]>arr[j]){
                    idx=j;
                }
            }
            if(idx!=i){
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String a[]){

        int arr[]={10,6,55,67,34,5};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
