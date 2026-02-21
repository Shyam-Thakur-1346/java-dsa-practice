import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]= in.nextInt();
        } 
        reverse(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}


// input 2 3 54 67 34
// output [34, 67, 54, 3, 2]

// this is done by two pointer method
// two pointer method - start pointer at beginning and end pointer at end