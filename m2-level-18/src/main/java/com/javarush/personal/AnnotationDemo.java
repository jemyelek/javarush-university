package com.javarush.personal;

public class AnnotationDemo {

    @Deprecated
    public void oldMethod() {
        System.out.println("Deprecated method, do not use it.");
    }

    @SuppressWarnings("unused")
    public void newMethod() {
        String notUsed = "This variable unused.";
        System.out.println("New Method");
    }

    @Override
    public String toString() {
        return "String";
    }

    public static void main(String[] args) {
        AnnotationDemo demo = new AnnotationDemo();
        demo.oldMethod();
        demo.newMethod();
        System.out.println(demo);

        try {
            Deprecated deprecatedAnn = AnnotationDemo.class.getMethod("oldMethod").getAnnotation(Deprecated.class);
            if (deprecatedAnn != null)
                System.out.println("Method is deprecated as @Deprecated.");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
