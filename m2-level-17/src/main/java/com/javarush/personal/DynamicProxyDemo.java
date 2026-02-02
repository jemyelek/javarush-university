package com.javarush.personal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending new message: " + message);
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" Calling method: " + method.getName());
        System.out.println(" Args: " + (args != null ? args[0] : "No args"));
        Object resultMethod = method.invoke(target, args);
        System.out.println(" Method completed!");
        return resultMethod;
    }
}
public class DynamicProxyDemo {
    public static void main(String[] args) {
        MessageSender realSender = new EmailSender();

        MessageSender proxy = (MessageSender) Proxy.newProxyInstance(
          MessageSender.class.getClassLoader(),
          new Class[] {MessageSender.class},
          new LoggingHandler(realSender)
        );

        System.out.println("Without proxy: ");
        realSender.send("Hello!");

        System.out.println("Via proxy");
        proxy.send("Helo via proxy");
    }
}
