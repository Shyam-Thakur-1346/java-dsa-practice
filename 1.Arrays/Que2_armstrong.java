// armstrong number - An armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
// example 153 = 1^3 + 5^3 + 3^3
// To check if a number is armstrong, we can use the following steps:
// 1. Find the number of digits in the number.
// 2. Raise each digit to the power of the number of digits and sum them up.
// 3. If the sum is equal to the original number, it is armstrong.

// print all the three digit armstrong number
import java.util.Scanner;
class Que2_armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isarmstrong(n);
        System.out.println(ans);
    }
    static boolean isarmstrong(int n){
        int original =n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            sum = sum +cube;
            n=n/10;
        }
        return sum==original;
    }
}



// for all three digit numbers 
/*

class Main {
    public static void main(String[] args) {
        for (int n = 100; n <= 999; n++) {
            if (isArmstrong(n)) {
                System.out.println(n);
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);  // cube of digit
            n = n / 10;
        }
        return sum == original;
    }
}

*/