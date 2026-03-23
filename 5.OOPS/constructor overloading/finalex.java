public class finalex{
    final int x = 10;

    void change() {
        // x = 20;  Error: cannot assign a value to final variable
        System.out.println(x);
    }
} 
// when a non primitive is final we can ntot reassign it.

// in java we dont have deconstructor , here we have finalizer and called during garbage collector