package classes;

public class Teacher extends Person{

    public Teacher(String name, int age, String favCourse) {
        super(name, age, favCourse);
    }

    public String introduce() {
        return "hello, my name is " + this.getName()+ ", and I teach " + this.getFavCourse();
    }
}
