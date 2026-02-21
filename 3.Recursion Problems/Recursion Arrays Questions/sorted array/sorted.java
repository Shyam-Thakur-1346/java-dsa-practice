public class sorted{
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        System.out.print(issorted(arr,0));
    }
    static boolean issorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && issorted(arr,index+1);
    }
}