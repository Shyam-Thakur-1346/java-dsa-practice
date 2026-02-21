public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));        
    }
    static int fact(int n){
        if(n<0){
            System.out.println("factorial not defined for negative number");
            return -1;
        }
        if(n==0||n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}

