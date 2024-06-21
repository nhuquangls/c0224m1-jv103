import animal.Animal;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryController factoryController = new FactoryController();
        Animal cat = factoryController.getAnimal("Cat");
        Animal dog = factoryController.getAnimal("Dog");
        System.out.println("Cat sound: " + cat.makSound());
        System.out.println("Dog sound: " + dog.makSound());
    }
}
