package Mapss;

public class Treeset1 {
    public int age;
    public String Name;

    public Treeset1(int age, String Name) {
        this.Name = Name;
        this.age = age;
    }

    public void setAge() {
        this.age = age;
    }

    public void setName() {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public String toString() {
        return "\n Name is:" + Name + " \t Age is:" + age + ":";
    }

}
