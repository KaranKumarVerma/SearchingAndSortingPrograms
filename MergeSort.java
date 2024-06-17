public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void mergeSort(int arr[],int st, int end){

        if(st>=end){
            return;
        }
        int mid= (st+end)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
        
    }


    //to merge the divided part of array
    public static void merge(int arr[],int st,int mid,int end){
        int temp[]=new int[end-st+1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<mid+1 && j<=end){
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left over part
        while(i<mid+1){
            temp[k]=arr[i];
            i++;
            k++;
        }

        //right over part
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(int m=st,n=0;n<temp.length;m++,n++){
            arr[m]=temp[n];

        }
    }

    public static void main(String a[]){

        int arr[]={10,6,55,67,34,5};
        printArr(arr);
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
