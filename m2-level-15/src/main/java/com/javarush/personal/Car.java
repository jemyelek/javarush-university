package com.javarush.personal;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model) {
        this.model = model;
        this.engine = this.new Engine(200);
    }

    public void drive() {
        engine.start();
        System.out.println("Car " + model + " is driving");
    }

    public Engine createNewEngine(int hp) {
        return this.new Engine(hp);
    }

    private class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("Engine whit " + horsepower + " horsepower is started.");
        }

        public void displayInfo() {
            System.out.println("Engine info: " + horsepower + " horsepower from Las Vegas");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ferrari X233");
        car1.drive();

        Car.Engine extraEngine = car1.createNewEngine(350);
        extraEngine.displayInfo();

        Car bmw = new Car("BMW X5");
        Car.Engine bmwEngine  = bmw.new Engine(230);
        bmwEngine.displayInfo();
        bmw.drive();
    }
}
