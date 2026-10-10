class student2 {
    String name;
    int Marks;

    void setname(String name) {
        this.name = name;
    }

    void setMarks(int Marks) {
        if (Marks >= 0 && Marks <= 100) {
            this.Marks = Marks;
        } else {
            System.out.println("invalid marks");
        }
    }

    String getname() {
        return this.name;
    }

    int getMarks() {
        return this.Marks;
    }
}

public class settergetter {
    public static void main(String[] args) {

        student2 s1 = new student2();

        s1.setname("Shruti");
        s1.setMarks(85);

        System.out.println("Name: " + s1.getname());
        System.out.println("Marks: " + s1.getMarks());
    }
}