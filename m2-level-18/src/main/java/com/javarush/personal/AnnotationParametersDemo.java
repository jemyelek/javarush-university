package com.javarush.personal;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
@Documented
@interface MyAnnotation {
    String name() default "no name";

    int value();

    String description() default "";
}

@MyAnnotation(value = 100, name = "Important Class", description = "Top Class of the App")
class ImportantClass {

    @MyAnnotation(value = 50)
    public void processData() {
        System.out.println("Processing data...");
    }

    @MyAnnotation(value = 25, description = "Testing method")
    public void testMethod() {
        System.out.println("Testing...");
    }

}

class SubClass extends ImportantClass {


}

public class AnnotationParametersDemo {
    public static void main(String[] args) {
        Class<ImportantClass> clazz = ImportantClass.class;
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
            System.out.println("Class with annotation");
            System.out.println(" name: " + annotation.name());
            System.out.println(" value: " + annotation.value());
            System.out.println(" description: " + annotation.description());


        }

    }
}
