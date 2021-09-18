package zooPark;

public class Lion implements Hunters, LongHaired {
    private String name;
    private double age;
    private String meal;

    public Lion (String name, double ages, String meal){
        this.name = name;
        this.age = ages;
        this.meal = meal;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRealAge() {
        return age * 4.1;
    }

    @Override
    public String getMeal() {
        return  meal + " At 10:30 o'clock";
    }

    @Override
    public String toothBrashing() {
        return "At 11:00";
    }

    @Override
    public void combing() {
        System.out.println("Расческа для льва");
    }
}
