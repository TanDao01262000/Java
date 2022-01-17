package com.JavaCore.Abstraction;


class Main extends StudentAbstractClass {

    @Override
    void greeting(String s) {
        System.out.println("Say: " + s);
    }

    @Override
    void study() {
        System.out.println("I am studying");
    }

}
class Main1 implements StudentInterface{
    @Override
    public void sing() {
        System.out.println("Singing");
    }

    @Override
    public void dance() {
        System.out.println("dancing");
    }
}

class Test{
    public static void main(String[] args){
//        StudentAbstractClass obj = new Main();
//        obj.setName("Toyota");
//        obj.study();
//        obj.greeting("hello");
//        System.out.println(obj.getName());

        StudentInterface obj1 = new Main1();
        obj1.dance();
        obj1.sing();
    }
}

