public class sum{
    public static void main(String[] args) {
        System.out.println(funsum(5));
    }
    static int funsum(int n){
        if(n<=1){
            return 1;
        }
        return n + funsum(n-1);
    }
}