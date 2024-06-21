package factory;

import animal.Animal;
import animal.Cat;

public class CatFactory implements AnimalFactory {

    @Override
    public Animal create() {
        return new Cat();
    }
}
