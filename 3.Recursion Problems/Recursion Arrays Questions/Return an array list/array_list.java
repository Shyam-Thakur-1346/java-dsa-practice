import java.util.ArrayList;
class array_list{
    public static void main(String[] args){
        int[] arr={2 ,6,4 ,6, 2,4, 6, 8};
        ArrayList<Integer> ans =findAllIndex(arr,4,0,new ArrayList<>()) ;
        System.out.println(ans);
    }
//  Return an Array List
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index, ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}