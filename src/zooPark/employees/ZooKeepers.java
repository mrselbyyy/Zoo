package zooPark.employees;

public class ZooKeepers {
    private String name;
    private int age;
    private int id;
    private boolean male;

    public ZooKeepers(String name, int age, int id, boolean male) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.male = male;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "ZooKeepers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String toStringForID() {
        return "ZooKeepers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
