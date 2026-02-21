/* subsets - permutations and combinations
subsets - non adjacent collection
[3,5,9] - [3] [3,5] [3,9] [3,5,9] [5,9] [5] [9]
with recursion and iteration 

when to apply subset pattern  - this pattern of taking some elements and removing 
some .  */
public class que3_subSequences {
    public static void main(String[] args) {
    subseq("","abc");
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
}
//output: abc ab ac a bc b c