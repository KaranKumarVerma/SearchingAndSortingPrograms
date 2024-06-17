public class BubbleSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String args[]){
        int arr[]={2,43,23,5,67,4};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}
