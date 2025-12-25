package com.javarush.personal;

interface Task {
    void execute();
}

class HelloTask implements Task {
    @Override
    public void execute() {
        System.out.println("Hello world!");
    }
}
public class InterfaceDemo  {

    public static void main(String[] args) {
        Task task1 = new HelloTask();
        task1.execute();

        Task task2 = new Task() {
            @Override
            public void execute() {
                System.out.println("Unanimous Bye to all!");
            }
        };
        task2.execute();

        new Task(){
            @Override
            public void execute() {
                System.out.println("Main");
            }
        }.execute();
    }
}
