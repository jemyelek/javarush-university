package com.javarush.personal;

public class ExtendDemo {

    static class Device {

        String model;

        public Device(String model) {
            this.model = model;
        }

        void turnOn() {
            System.out.println(model + " is turned on.");
        }

    }

    static class Phone extends Device {
        public Phone(String model) {
            super(model);
        }

        void call() {
            System.out.println(model + " is calling...");
        }
    }

    static class Laptop extends Device {
        public Laptop(String model) {
            super(model);
        }

        void code() {
            System.out.println(model + " is running some codes...");
        }
    }

    static class RepairService<T extends Device> {
        private T device;

        public void setDevice(T device) {
            this.device = device;
        }

        public T getDevice() {
            return device;
        }

        public void diagnose() {
            System.out.println("Devices diagnoses ");
            device.turnOn();
//            device.call();
        }
    }

    public static void main(String[] args) {
        System.out.println("Repair Service is getting Phone:");
        RepairService<Phone> phone = new RepairService<>();
        phone.setDevice(new Phone("Samsung"));
        System.out.println(phone.getDevice().model);
        phone.diagnose();

        System.out.println();
        System.out.println("Repair Laptop");
        RepairService<Laptop> laptop = new RepairService<>();
        laptop.setDevice(new Laptop("MacBook Pro"));
        System.out.println(laptop.getDevice().model);

    }
}
