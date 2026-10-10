class Student3 {
    String name;
    int marks;
}

class Studentfactory {

    Student3 create() {
        Student3 s = new Student3();

        s.name = "Ram";
        s.marks = 95;

        return s;
    }
}

public class studentmarks {
    public static void main(String[] args) {

        Studentfactory f1 = new Studentfactory();

        Student3 s1 = f1.create();

        System.out.println("The name is: " + s1.name);
        System.out.println("The marks are: " + s1.marks);
    }
}