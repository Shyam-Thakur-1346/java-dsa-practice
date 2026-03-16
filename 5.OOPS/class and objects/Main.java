class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();   // object 1
        c1.brand = "BMW";
        c1.speed = 200;

        Car c2 = new Car();   // object 2
        c2.brand = "Audi";
        c2.speed = 180;

        c1.display();
        c2.display();
    }
}