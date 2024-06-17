import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int arr[],int key){
        int st=0;
        int end=arr.length-1;
        int mid;
        while(st<end){
            mid=(st+end)/2; 
            if(arr[mid]==key)
            {
                return true;
            }
            else if(arr[mid]<key)
            {
                st=mid+1;
            }    
            else
               { end=mid-1;}
        }
        return false;
    }

    static void printArr(int arr[]){

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[]={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        sc.close();
        printArr(arr);
        System.out.println("etner key that you want to search:");
        int key=sc.nextInt();
        System.out.println("is key present in array:"+binarySearch(arr,key));
    }
}
