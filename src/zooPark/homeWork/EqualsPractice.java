package zooPark.homeWork;




import zooPark.Animals;
import zooPark.allAnimals.*;
import zooPark.homeWork.sort.SortByName;
import zooPark.homeWork.sort.SortByWeight;

import java.util.*;

public class EqualsPractice  {
    //Создать мапу ключ - имя животного, значение - само животное - ok
    //Переопределить equals, hashcode - ok
    //Сравнить одинаковых животных и разных животных -ok
    //Comparable: сравнить животных по весу
    //Comparator - ok
    //Прочитать про сортировку. - ok


    public static void main(String[] args) {
        Lion alex = new Lion("Alex", 5, "Lamb", 50);
        Lion simba = new Lion("Alex", 5, "Lamb", 50);
        Zebra marty = new Zebra("Marty", 5, "Green", 300);
        Giraffe melman = new Giraffe("Melman", 7, "Trees", 600);
        Fox alice = new Fox("Alice", 7, "Chicken", 20);
        Wolf ivan = new Wolf("Ivan", 5, "Beef", 45);
        Wolf nick = new Wolf("Nickola", 5, "Beef", 45);
        Wolf test = new Wolf("Alex", 5, "Lamb", 50);


        Map<String, Animals> animalsMap = new HashMap<>();
        animalsMap.put(alex.getName(), alex);
        animalsMap.put(marty.getName(), marty);
        animalsMap.put(melman.getName(), melman);
        animalsMap.put(alice.getName(), alice);
        animalsMap.put(ivan.getName(), ivan);
        animalsMap.put(nick.getName(), nick);

        Iterator<Animals> animalsIterator = animalsMap.values().iterator();
        while (animalsIterator.hasNext()) {
            Animals nextAnimal = animalsIterator.next();
            System.out.println(nextAnimal);
        }
        System.out.println("_______________________");


// Сравнить два одинаковых объекта и два разных
        System.out.println(ivan.equals(nick));
        System.out.println(alex.equals(simba));
        System.out.println("_______________________");

        System.out.println(alex.hashCode());
        System.out.println(simba.hashCode());
        System.out.println(test.hashCode());

        System.out.println("_______________________");
        System.out.println("Сортировка по весу");

        List<Animals> animalsByWeight = new ArrayList<Animals>();
        animalsByWeight.add(alex);
        animalsByWeight.add(marty);
        animalsByWeight.add(melman);
        animalsByWeight.add(ivan);
        animalsByWeight.add(alice);

        Collections.sort(animalsByWeight, new SortByWeight());

        for (Animals animal :
                animalsByWeight) {
            System.out.println(animal.getWeight() + "|" + animal.getName());
        }

        System.out.println("_______________________");
        System.out.println("Сортировка по имени");
        List<Animals> animalsByName = new ArrayList<Animals>(animalsByWeight);

        Collections.sort(animalsByName, new SortByName());

        for (Animals animal :
                animalsByName) {
            System.out.println(animal.getName());
        }

        }

    }










