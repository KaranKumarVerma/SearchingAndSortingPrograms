import java.util.Scanner;

class LinearSearch{

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,34,5,23,54};
        boolean flag=false;
        printArr(arr);
        Scanner sc= new Scanner(System.in);
        //logic for linear search algorithm...
        System.out.println("Enter the key that you want to search in array");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Key present in following index:"+i);
                flag=true;
                break;
           }
        }
        if(flag==false)
            System.out.println("Key not present in array");
        
    }
}