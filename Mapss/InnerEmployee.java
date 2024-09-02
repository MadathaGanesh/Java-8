package Mapss;

public class InnerEmployee {
    private int id;
    private String name;

    public InnerEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return " \n Name is [" + name + "\t id is :" + id + "]+ ";
    }
}
