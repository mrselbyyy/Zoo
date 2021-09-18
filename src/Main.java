import zooPark.*;

public class Main {
    public static void main(String[] args) {
        Lion alex = new Lion("Alex", 5, "Meat");
        System.out.println("Name: " + alex.getName());
        System.out.println("Ages: " + alex.getRealAge());
        System.out.println("Meal: " + alex.getMeal());
        Zebra marty = new Zebra("Marty", 5, "Green", 300);
        System.out.println("Name: " + marty.getName());
        System.out.println("Ages: " + marty.getRealAge());
        System.out.println("Meal: " + marty.getMeal());
        Giraffe melman = new Giraffe("Melman", 7, "Trees", 600);
        System.out.println("Name: " + melman.getName());
        System.out.println("Ages: " + melman.getRealAge());
        System.out.println("Meal: " + melman.getMeal());
        Fox alice = new Fox("Alice", 7, "Chicken");
        System.out.println("Name: " + alice.getName());
        System.out.println("Ages: " + alice.getRealAge());
        System.out.println("Meal: " + alice.getMeal());
        Wolf ivan = new Wolf("David", 5, "Beef");
        System.out.println("Name: " + ivan.getName());
        System.out.println("Ages: " + ivan.getRealAge());
        System.out.println("Meal: " + ivan.getMeal());

    }
}
