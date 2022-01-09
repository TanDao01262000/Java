package com.AdvancedJava.Annotation;

import java.lang.reflect.Method;

public class MyClass {
    @CustomAnnotation(7)
    public void sayHello(){
        System.out.println("hello, this my custom annotation");
    }
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass myClass = new MyClass();
        Method methodVal = myClass.getClass().getMethod("sayHello");
        CustomAnnotation customAnnotation = methodVal.getAnnotation(CustomAnnotation.class);
        System.out.println("Value is: " + customAnnotation.value());
    }

}
