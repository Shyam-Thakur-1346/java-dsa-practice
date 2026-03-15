class Students {
    int rollno;
    float marks;
    String name;
}

public class Basics {
    public static void main(String[] args) {

        Students s1 = new Students();

        s1.rollno = 101;
        s1.marks = 85.5f;
        s1.name = "Shyam";

        System.out.println("Roll No: " + s1.rollno);
        System.out.println("Marks: " + s1.marks);
        System.out.println("Name: " + s1.name);
    }
}