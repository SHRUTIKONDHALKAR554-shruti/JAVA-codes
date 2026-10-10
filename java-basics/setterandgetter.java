class Student1 {
    private String name;
    private int marks;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setMarks(int marks) {
        this.marks = marks;
    }
    int getMarks() {
        return marks;
    }
}
public class setterandgetter {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("Shruti");
        s1.setMarks(80);
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}