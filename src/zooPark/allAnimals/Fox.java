package zooPark.allAnimals;

import zooPark.Hunters;
import zooPark.LongHaired;
import zooPark.WashingAnimals;

public class Fox implements Hunters, WashingAnimals, LongHaired {
    private String name;
    private double age;
    private String meal;
    private int weight;

    public Fox (String name, double ages, String meal, int weight){
        this.name = name;
        this.age = ages;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' + '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRealAge() {
        return age * 4.8;
    }

    @Override
    public String getMeal() {
        return meal + " At 12:00 o'clock";
    }

    @Override
    public boolean singleAnimals() {
        return true;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toothBrashing() {
        return "At 12:30";
    }

    @Override
    public void washing() {
        System.out.println("Помыть животное");
    }

    @Override
    public void combing() {
        System.out.println("Расческа для лисы");
    }
}
