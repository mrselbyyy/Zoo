package Pack;

public class Wolf implements Animals{
    private String Name;
    private double Age;
    private String Meal;

    public Wolf (String n, double a, String m){
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
        return Age * 5.5;
    }

    @Override
    public String getMeal() {
        return Meal + " At 11:45 o'clock";
    }
}
