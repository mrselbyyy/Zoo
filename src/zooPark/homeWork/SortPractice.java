package zooPark.homeWork;

import zooPark.employees.ZooKeepers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPractice {





    public static void main(String[] args) {


        ZooKeepers id111 = new ZooKeepers("Jade", 24, 111, false);
        ZooKeepers id222 = new ZooKeepers( "Sam", 28, 222, true);
        ZooKeepers id333 = new ZooKeepers("Jack", 38, 333, true);
        ZooKeepers id444 = new ZooKeepers("Mari", 36, 444, false);
        ZooKeepers id555 = new ZooKeepers("Adam", 37, 555, true);
        ZooKeepers id666 = new ZooKeepers("Arnold", 25, 666, true);
        ZooKeepers id777 = new ZooKeepers("Mila", 42, 777, false);
        ZooKeepers id888 = new ZooKeepers("Leo", 40, 888, true);

        List<ZooKeepers> employees = new ArrayList<>();

        employees.add(id111);
        employees.add(id222);
        employees.add(id333);
        employees.add(id444);
        employees.add(id555);
        employees.add(id666);
        employees.add(id777);
        employees.add(id888);

// Пузырьковая сортировка.
//Отсортировал по возрасту
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < employees.size() ; i++) {

                if (employees.get(i).getAge() < employees.get(i - 1).getAge()){
                    ZooKeepers tmp = employees.get(i - 1);
                    employees.set(i - 1, employees.get(i));
                    employees.set(i, tmp);
                    needIteration = true;
            }
            }
        }
      for (ZooKeepers emp: employees
             ) {
            System.out.println(emp.toString());
        }
        System.out.println("__________________________________");

//Сортировка вставками
//Отсортировал по ID
        for (int left = 1; left < employees.size(); left++){
            ZooKeepers current = employees.get(left);
            int i = left;
            while (i > 0 && employees.get(i - 1).getId() > employees.get(i).getId()){
                employees.set(i, employees.get(i - 1));
                i--;
            }
            employees.set(i, current);
        }
//Индекс 333 неверно встал, не разобрался почему
       for (ZooKeepers empl: employees) {
            System.out.println(empl.toStringForID());
        }

    }

}
