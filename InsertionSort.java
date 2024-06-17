public class InsertionSort {
     //To print array
     public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void insertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String a[]){

        int arr[]={10,6,55,67,34,5};
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
