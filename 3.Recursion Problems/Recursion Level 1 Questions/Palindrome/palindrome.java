public class palindrome{
    public static void main(String[] arge){
        System.out.println(palin(145412));
    }
    static int rev(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if (n % 10 == n) {   // Base condition: single digit left
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n){
        return n==rev(n);
}

}