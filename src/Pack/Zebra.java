package Pack;

public class Zebra implements Animals {
    private String Name;
    private double Age;
    private String Meal;

    public Zebra(String n, double a, String m) {
        this.Name = n;
        this.Age = a;
        this.Meal = m;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public double getRealAge() {
        return Age * 4.9;
    }

    @Override
    public String getMeal() {
        return Meal + " At 11:00 o'clock";
    }
}
