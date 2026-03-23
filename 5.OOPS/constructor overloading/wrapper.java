public class wrapper {
    public static void main(String[] args) {
        int a = 10;

        // Converting primitive to object (Boxing)
        Integer obj = Integer.valueOf(a);

        // Converting object to primitive (Unboxing)
        int b = obj.intValue();

        System.out.println("Primitive: " + a);
        System.out.println("Wrapper Object: " + obj);
        System.out.println("Unboxed value: " + b);
    }
}
