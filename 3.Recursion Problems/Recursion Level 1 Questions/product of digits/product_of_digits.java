public class product_of_digits{
    public static void main(String[] args) {
        int ans =product(2413);
        System.out.println(ans);
    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        return product(n/10)*(n%10);
    }
}