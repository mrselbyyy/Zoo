package zooPark.homeWork;

import zooPark.Animals;
import zooPark.allAnimals.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ArrayPractice {
    /*1. Создать коллекцию - зоопарк. Добавить в неё всех ранее созданных животных.
2. Вывести всех животных на экран (в цикле).
3. Вывести на экран со второго по четвёртого животных.
4. Создать два вольера - один для животных, которые не любят животных, таких же как они, другой - для всех остальных.
5. Удалить из обоих вольеров хищников.
6. Создать мапу и поместить в неё и хищных и травоядных. Ключ - тип животного.

     */





    public static void main(String[] args) {
        Lion alex = new Lion("Alex", 5, "Lamb", 50);
        Zebra marty = new Zebra("Marty", 5, "Green", 300);
        Giraffe melman = new Giraffe("Melman", 7, "Trees", 600);
        Fox alice = new Fox("Alice", 7, "Chicken", 20);
        Wolf ivan = new Wolf("Ivan", 5, "Beef", 45);



//Создать коллекцию - зоопарк. Добавить в неё всех ранее созданных животных.
        System.out.println("Создать коллекцию - зоопарк. Добавить в неё всех ранее созданных животных:");
        ArrayList<Animals> allAnimals = new ArrayList<>();
        allAnimals.add(alex);
        allAnimals.add(marty);
        allAnimals.add(melman);
        allAnimals.add(alice);
        allAnimals.add(ivan);
//Вывести всех животных на экран (в цикле).
        System.out.println("Вывести всех животных на экран (в цикле):");

        for (int i = 0; i < allAnimals.size(); i++) {
            System.out.println(allAnimals.get(i).getName());
        }
        System.out.println("---------------------------");

//Вывести на экран со второго по четвёртого животных.
        System.out.println("Вывести на экран со второго по четвёртого животных:");
        for (int i = 1; i < 4; i++) {
            System.out.println(allAnimals.get(i).getName());

        }
        System.out.println("---------------------------");
//Создать два вольера - один для животных, которые не любят животных, таких же как они, другой - для всех остальных.
        System.out.println("Создать два вольера - один для животных, которые не любят животных, таких же как они, другой - для всех остальных." + "\n" );
        ArrayList<Animals> cageForSingle = new ArrayList<>(allAnimals);
        ArrayList<Animals> cageForOther = new ArrayList<>(allAnimals);

        Iterator<Animals> animalsIterator = allAnimals.iterator();
        while (animalsIterator.hasNext()){
            Animals nextAnimal = animalsIterator.next();
            if (nextAnimal.singleAnimals()){
                cageForOther.remove(nextAnimal);
            }

            else {cageForSingle.remove(nextAnimal);
            }
        }
        System.out.println("Вольер для одиночных:");
        for (Animals animals :
                cageForSingle) {
            System.out.println(animals.getName());
        }
        System.out.println("----");
        System.out.println("Вольер для неодиночных:");
        for (Animals animals :
                cageForOther) {
            System.out.println(animals.getName());
        }
        System.out.println("---------------------------" + "\n");
        System.out.println("Удалить из обоих вольеров хищников.");
        //Мог ли я за один итератор удалить хищников из двух коллекций?
        /*Думал переопределить equals чтобы искать по полю питания, но если я правильно понял, такой метод нужен для каждого животного отдельно, можешь на след. занятии
         * показать как это делается?*/

        Iterator<Animals> deleteHunters = cageForSingle.iterator();
        while (deleteHunters.hasNext()){
            Animals nextHunter = deleteHunters.next();
            if (nextHunter.hashCode() == alice.hashCode() | nextHunter.hashCode() == alex.hashCode() | nextHunter.hashCode() == ivan.hashCode()){
                cageForSingle.remove(nextHunter);
            }
        }



        for (Animals animals :
                cageForSingle) {
            System.out.println(animals.getName());
        }

        for (Animals animals :
                cageForOther) {
            System.out.println(animals.getName());
        }


        System.out.println("---------------------------" + "\n");
        System.out.println("Создать мапу и поместить в неё и хищных и травоядных. Ключ - тип животного.");
        HashMap<Integer, String> cageForAll = new HashMap<>();
        cageForAll.put(111, alex.getName());
        cageForAll.put(222, alice.getName());
        cageForAll.put(333, ivan.getName());
        cageForAll.put(444, marty.getName());
        cageForAll.put(555, melman.getName());

        System.out.println(cageForAll);



        
            

        }

    }






