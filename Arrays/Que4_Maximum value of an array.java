import java.util.Scanner;
//import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]= in.nextInt();
        } 
     
     System.out.println("max:"+maxRange(arr,0,1)+max(arr));
    }
    
    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
    
// input 23 4 545 56 32
// output 545
    
    
    
    // finding maximum value in a given SecurityManager
    static int maxRange(int[] arr,int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}

// input 23 4 545 56 32
// output 23                         suppose max value between index 0 and 1 that is 23