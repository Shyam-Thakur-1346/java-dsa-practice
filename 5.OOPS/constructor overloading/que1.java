public class que1{
    public static void main(String[] args) {

        Student s1 = new Student();                    // default
        Student s2 = new Student(1, "Shyam");          // 2 params
        Student s3 = new Student(2, "Rahul", 90);      // 3 params

        s1.display();
        s2.display();
        s3.display();
    }
} 
class Student {
    int rollNo;
    String name;
    int marks;
    // Default Constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }
    // Constructor with 2 parameters
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = 0;
    }
    // Constructor with 3 parameters
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

