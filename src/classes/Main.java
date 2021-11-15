package classes;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Tom",20,"software design");
        Teacher t = new Teacher("Andries",40,"CIN");
        System.out.println(s.introduce());
        System.out.println(t.introduce());
    }
}
