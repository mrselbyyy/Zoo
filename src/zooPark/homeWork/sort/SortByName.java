package zooPark.homeWork.sort;

import zooPark.Animals;

import java.util.Comparator;

public class SortByName implements Comparator<Animals> {

    @Override
    public int compare(Animals animal1, Animals animal2) {
        return animal1.getName().compareTo(animal2.getName());
    }
}
