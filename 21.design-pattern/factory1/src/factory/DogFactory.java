package factory;

import animal.Animal;
import animal.Dog;

public class DogFactory implements AnimalFactory {

    @Override
    public Animal create() {
        return new Dog();
    }
}
