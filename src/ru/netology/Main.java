package ru.netology;

public class Main {
    public static final int BUYERS = 5;

    public static void main(String[] args) {
        final CarShowroom dealer = new CarShowroom();
        for (int i = 1; i <= BUYERS; i++) {
            new Thread(null, dealer::sellCar, "Покупатель " + i).start();
        }
        new Thread(null, dealer::receiveCar, "Производитель").start();
    }
}