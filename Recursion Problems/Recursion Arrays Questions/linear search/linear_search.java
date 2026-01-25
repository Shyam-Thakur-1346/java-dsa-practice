import java.util.ArrayList;
class linear_search{
    public static void main(String[] args){
        int[] arr={2 ,6,4 ,6, 2,4, 6, 8};
        System.out.println(findindex(arr,6,0));
        System.out.println(findlastindex(arr,6,arr.length-1));
         findallindex(arr,6,0);
         System.out.println(list);
        ArrayList<Integer> ans =findAllIndex(arr,4,0,new ArrayList<>()) ;
        System.out.println(ans);
    }
    static int findindex(int[] arr,int target,int index){
       
        if(index==arr.length){
            return -1;
        }
         if(arr[index]==target){
            return index;
        }
        return findindex(arr,target,index+1);
    }

     static int findlastindex(int[] arr,int target,int index){
    
        if(index==-1){
            return -1;
        }
         if(arr[index]==target){
            return index;
        }
        return findlastindex(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
     static void findallindex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findallindex(arr,target,index+1);
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