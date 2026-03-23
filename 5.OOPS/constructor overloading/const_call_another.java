
public class const_call_another {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        this("Unknown", 0); // calling Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }
}

