package zooPark.allAnimals;

import zooPark.Hunters;
import zooPark.LongHaired;

import java.util.Objects;

public class Lion implements Hunters, LongHaired {
    private String name;
    private double age;
    private String meal;
    private int weight;

    public Lion (String name, double ages, String meal, int weight){
        this.name = name;
        this.age = ages;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\''+ '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return Double.compare(lion.age, age) == 0 && name.equals(lion.name) && meal.equals(lion.meal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, meal);
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
    public boolean singleAnimals() {
        return false;
    }

    @Override
    public int getWeight() {
        return weight;
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
