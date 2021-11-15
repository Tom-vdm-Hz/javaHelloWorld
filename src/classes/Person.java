package classes;

public class Person {
    private String name;
    private int age;
    private String favCourse;

    public Person(String name, int age, String favCourse) {
        this.name = name;
        this.age = age;
        this.favCourse = favCourse;
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
