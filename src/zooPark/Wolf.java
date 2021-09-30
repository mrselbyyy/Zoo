package zooPark;

public class Wolf implements Hunters {
    private String name;
    private double age;
    private String meal;

    public Wolf (String n, double a, String m){
        this.name = n;
        this.age = a;
        this.meal = m;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRealAge() {
        return age * 5.5;
    }

    @Override
    public String getMeal() {
        return meal + " At 11:45 o'clock";
    }

    @Override
    public boolean singleAnimals() {
        return true;
    }

    @Override
    public String toothBrashing() {
        return "At 12:00";
    }
}
