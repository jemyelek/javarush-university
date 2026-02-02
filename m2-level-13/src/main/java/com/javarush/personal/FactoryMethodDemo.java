package com.javarush.personal;

import static java.lang.Thread.sleep;

public class FactoryMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        TaskFactory ioFactory = new IOTaskFactory();
        ioFactory.runInThread();
        sleep(100);

        TaskFactory computeFactory = new ComputeTaskFactory();
        computeFactory.runInThread();
        sleep(100);
    }
}

class IOTaskFactory extends TaskFactory {
    @Override
    public Task createTask() {
        return new IOTask();
    }
}

abstract class TaskFactory {
    public abstract Task createTask();

    public void runInThread() {
        Task task = createTask();
        new Thread(task::execute).start();
    }
}

class IOTask implements Task {
    @Override
    public void execute() {
        System.out.println("Input/Output Task is working.");
    }
}

class ComputeTask implements Task {
    @Override
    public void execute() {
        System.out.println("Computing Task is working.");
    }
}

class ComputeTaskFactory extends TaskFactory {
    @Override
    public Task createTask() {
        return new ComputeTask();
    }
}

interface Task {
    void execute();
}
