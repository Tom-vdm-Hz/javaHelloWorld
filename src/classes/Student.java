package classes;

public class Student extends Person{

    public Student(String name, int age, String favCourse) {
        super(name, age, favCourse);
    }

    public String introduce(){
        return "hello, my name is "+this.getName()+", and I am "+this.getAge()+" years old, my favorite course is "+this.getFavCourse();
    }


}
