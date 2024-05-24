package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gà kêu: Ò ó o";
    }

    @Override
    public String howtoEat() {
        return "Gà phải nấu chín";
    }
}
