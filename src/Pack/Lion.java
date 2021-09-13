package Pack;

public class Lion implements Hunterble {
    private String Name;
    private double Age;
    private String Meal;

    public Lion (String n, double a, String m){
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
        return Age * 4.1;
    }

    @Override
    public String getMeal() {
        return  Meal + " At 10:30 o'clock";
    }

    @Override
    public String hunt() {
        return null;
    }
}
