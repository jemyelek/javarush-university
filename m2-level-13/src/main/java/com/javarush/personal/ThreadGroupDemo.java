package com.javarush.personal;

public class ThreadGroupDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Work Group");

        for (int i = 1; i <= 3; i++) {
            new Thread(group, () -> {
                System.out.println(Thread.currentThread().getName() +
                        " is member of " + Thread.currentThread().getThreadGroup().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted.");
                }
            }, "Thread-" + i).start();
        }

        System.out.println("\nIn the Group " + group.getName() + " threads count - " + group.activeCount());
        Thread.sleep(5000);
        System.out.println("Interruption.");
        group.interrupt();

        System.out.println("Current Group " + group.getName() + " was interrupted.");
        System.out.println("Parent Group " + group.getParent().getName());
    }


}
