class Demo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}

public class finalizeex {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj = null; // object eligible for garbage collection

        System.gc(); // request JVM to call Garbage Collector

        System.out.println("End of main");
    }
}