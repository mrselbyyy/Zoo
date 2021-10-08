package zooPark.allAnimals;

import zooPark.Herbivores;
import zooPark.PassForVisitors;
import zooPark.WashingAnimals;

public class Giraffe implements Herbivores, WashingAnimals, PassForVisitors {
    private String name;
    private double age;
    private String meal;
    private int weight;

    public Giraffe (String name, double ages, String meal, int weight){
        this.name = name;
        this.age = ages;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' + '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRealAge() {
        return age * 3.5;
    }

    @Override
    public String getMeal() {
        return meal + " At 11: 15 o'clock";
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
    public double weightMeal() {
        return weight * 0.9;
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
