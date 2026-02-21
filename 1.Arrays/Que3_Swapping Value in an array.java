import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]= in.nextInt();
        } 
     swap (arr,1,2);
     System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}


// input 1 2 3 4 5
// output 1 3 2 4 5          swapped value of position 1 and 2