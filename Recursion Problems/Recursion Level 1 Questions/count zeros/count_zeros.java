public class count_zeros{
    public static void main(String[] args){
        count(405670);
        System.out.println(c);
        int ans=count1(76036004);
        System.out.println(ans);
    }
    static int  c=0;
    static void count(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        if(rem==0){
            c+=1;
        }
     count(n/10);
    }

    // second way

    static int count1(int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n==0){return c;}
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);

    }
} 