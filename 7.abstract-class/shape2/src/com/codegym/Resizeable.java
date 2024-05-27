package com.codegym;
import java.util.Random;

public interface Resizeable {
    default double getRandomNumber() {
        Random random = new Random();
        return random.nextDouble() * 99 + 1;
    }
    void resize();
}
