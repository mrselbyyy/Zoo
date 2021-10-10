package zooPark.homeWork.sort;

import zooPark.Animals;

import java.util.Comparator;

public class SortByWeight implements Comparator<Animals> {
    @Override
    public int compare(Animals animal1, Animals animal2) {
        if (animal1.getWeight() < animal2.getWeight()){
            return -1;
        } else  if (animal1.getWeight() == animal2.getWeight()){
            return 0;
        } else
            return 1;

    }
}
