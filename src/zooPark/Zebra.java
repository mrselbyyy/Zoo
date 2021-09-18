package zooPark;

public class Zebra implements Herbivores, WashingAnimals, PassForVisitors {
    private String name;
    private double age;
    private String meal;
    private double weight;

    public Zebra(String name, double ages, String meal, int weight) {
        this.name = name;
        this.age = ages;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRealAge() {
        return age * 4.9;
    }

    @Override
    public String getMeal() {
        return meal + " At 11:00 o'clock";
    }

    @Override
    public double weightMeal() {
        return weight * 1.1;
    }

    @Override
    public void washing() {
        System.out.println("Помыть животное");
    }

    @Override
    public boolean passInCage() {
        return true;
    }
}
