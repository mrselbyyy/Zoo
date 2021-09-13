package Pack;

public interface Animals {
    String getName();
    double getRealAge();
    String getMeal();

    public static void main(String[] args) {
        Lion alex = new Lion("alex", 5,"Meattt");
        System.out.println("Name: " + alex.getName());
        System.out.println("Ages: " + alex.getRealAge());
        System.out.println("Meal: " + alex.getMeal());
        Zebra Morty = new Zebra("Morty", 5, "Green");
        System.out.println("Name: " + Morty.getName());
        System.out.println("Ages: " + Morty.getRealAge());
        System.out.println("Meal: " + Morty.getMeal());
        Giraffe Malmon = new Giraffe("Malmon", 7,"Trees");
        System.out.println("Name: " + Malmon.getName());
        System.out.println("Ages: " + Malmon.getRealAge());
        System.out.println("Meal: " + Malmon.getMeal());
    }
}
