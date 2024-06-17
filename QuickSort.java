public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int st,int end){
        if(st>=end) 
        {return;}
        int idx=partition(arr,st,end);
        quickSort(arr, st, idx-1);
        quickSort(arr, idx+1, end);
    }

    public static int partition(int arr[],int st,int end){
        int pivot=arr[end];
        int i=st-1;
        for(int j=st;j<end;j++)
        {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[end];
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String a[]){

        int arr[]={10,6,55,67,34,5};
        printArr(arr);
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
