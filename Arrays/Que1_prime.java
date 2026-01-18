import java.util.Scanner;
class Que1_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}


// logic to find prime number - 
// A prime number is a number that is only divisible by 1 and itself.
// To check if a number is prime, we can use the following steps:
// 1. If the number is less than or equal to 1, it is not prime.
// 2. Check for factors from 2 to the square root of the number.
// 3. If we find any factors, the number is not prime.
// 4. If we don't find any factors, the number is prime.