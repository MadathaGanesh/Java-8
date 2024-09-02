package Method_References.ConstuctorReference2;

public class EmployeeClass {
    private String Name;
    private int age;

    public EmployeeClass(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String toString() {
        return "Name is : [" + Name + " .Age is :" + age + "  ]";
    }
}
