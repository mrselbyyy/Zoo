package Pack;

public class Fox implements Animals{
    private String Name;
    private double Age;
    private String Meal;

    public Fox (String n, double a, String m){
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
        return Age * 4.8;
    }

    @Override
    public String getMeal() {
        return Meal + " At 12:00 o'clock";
    }
}
