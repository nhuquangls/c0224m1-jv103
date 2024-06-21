import animal.Animal;
import factory.AnimalFactory;
import factory.CatFactory;
import factory.DogFactory;

import java.util.HashMap;
import java.util.Map;

public class FactoryController {
    AnimalFactory animalFactory;
    Map<String, AnimalFactory> factory = new HashMap<>();

    public FactoryController() {
        factory.put("Cat", new CatFactory());
        factory.put("Dog", new DogFactory());
    }
    public Animal getAnimal(String type) {
        return factory.get(type).create();
    }
}
