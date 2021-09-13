package Pack;

public class Giraffe implements Animals{
    private String Name;
    private double Age;
    private String Meal;

    public Giraffe (String n, double a, String m){
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
        return Age * 3.5;
    }

    @Override
    public String getMeal() {
        return Meal + " At 11: 15 o'clock";
    }
}
