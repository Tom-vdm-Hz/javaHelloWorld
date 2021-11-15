package classes;

public class Student {
    private String name;
    private int age;
    private String favCourse;

    public Student(String name, int age, String favCourse) {
        this.name = name;
        this.age = age;
        this.favCourse = favCourse;
    }

    public String introduce(){
        return "hello, my name is "+this.name+", and I am "+this.age+" years old, my favorite course is "+this.favCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favCourse='" + favCourse + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavCourse() {
        return favCourse;
    }

    public void setFavCourse(String favCourse) {
        this.favCourse = favCourse;
    }
}
