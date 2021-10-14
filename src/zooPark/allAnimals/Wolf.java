package zooPark.allAnimals;

import zooPark.Hunters;

import java.util.Objects;

public class Wolf implements Hunters {
    private String name;
    private double age;
    private String meal;
    private int weight;

    public Wolf (String name, double age, String meal, int weight){
        this.name = name;
        this.age = age;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Double.compare(wolf.age, age) == 0 && name.equals(wolf.name) && meal.equals(wolf.meal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, meal, getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' + '}';
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
    public int getWeight() {
        return weight;
    }

    @Override
    public String toothBrashing() {
        return "At 12:00";
    }
}
