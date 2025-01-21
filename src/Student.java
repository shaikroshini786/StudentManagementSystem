 public class Student {
    private int id;            // Student ID
    private String name;       // Student Name
    private int age;           // Student Age
    private String grade;      // Student Grade

    // Constructor
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Getter for Grade
    public String getGrade() {
        return grade;
    }

    // Display student details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}
