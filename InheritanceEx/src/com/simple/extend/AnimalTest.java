package com.simple.extend;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+"이(가) 먹이를 먹는다.");
    }

    public void sleep() {
        System.out.println(name+"이(가) 잠을 잔다.");
    }

    public String getName(){
        return name;
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println(getName()+" : 왈왈");
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("샤미");
    }

    @Override // 재정의 : 상위 클래스 메서드를 고쳐서 사용한다.
    public void eat(){
        System.out.println(getName() + "이(가) 생선을 조심스럽게 먹는다.");
    }

    public void meow(){
        System.out.println(getName() + " : 야옹~~");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
    Dog dog = new Dog("강아지");
    //dog.getName();
    dog.eat();
    dog.bark();

    Cat cat = new Cat("샤미");
    cat.eat();
    cat.meow();


    }

}
