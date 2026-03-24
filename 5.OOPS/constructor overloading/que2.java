
class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        this("Unknown", 0);  // constructor chaining
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // Method to display data
    void display() {
        System.out.println(name + " " + age);
    }

    public static void que2(String[] args) {
        Student s1 = new Student();             // calls default
        Student s2 = new Student("Shyam", 20);  // calls parameterized

        s1.display();
        s2.display();
    }
}
