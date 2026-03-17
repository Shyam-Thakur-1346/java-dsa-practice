package constructor;
public class que1 {
    public static void main(String[] args) {

        Student shyam = new Student(13, "Shyam", 76);

        shyam.display();
    }
}
class Student {
    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

