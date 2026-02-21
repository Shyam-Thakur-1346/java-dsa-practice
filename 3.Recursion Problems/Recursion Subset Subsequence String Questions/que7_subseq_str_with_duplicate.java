import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class que7_subseq_str_with_duplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        List<List<Integer>> ans=subsetduplicate(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
        static List<List<Integer>> subsetduplicate(int[] arr){
        Arrays.sort(arr);
        int start=0;
        int end=0;
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0&&arr[i]==arr[i-1]){
                start=end+i;
            }
            end=outer.size()-1;
            int n = outer.size();
            for (int j= 0; j < n; j++) {
                List<Integer>internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    } 
    }

