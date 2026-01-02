package com.simple.ex;

// 추상 부모 클래스
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 추상 메소드 - 자식 클래스에서 반드시 구현해야 함
    public abstract void makeSound();

    // 일반 메소드 - 자식 클래스에서 공통으로 사용
    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹습니다.");
    }

    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }

    public String getName() {
        return name;
    }

    // 템플릿 메소드 패턴 예시
    public final void dailyRoutine() {
        System.out.println("=== " + name + "의 하루 일과 ===");
        wakeUp();
        eat();
        makeSound();
        sleep();
        System.out.println();
    }

    // 추상 메소드 (선택적)
    protected abstract void wakeUp();
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

@Override
public void makeSound() {
    System.out.println(getName() + ": 왈왈!");
}

@Override
protected void wakeUp() {
    System.out.println(getName()+ " 이(가) 활기차게 일어났습니다.");
}

@Override
public void eat() {

}



public class AbstractAnimalTest {
    public static void main(String[] args) {
        Dog baduklee = new Dog("바둑이");
        baduklee.makeSound();
        baduklee.wakeUp();
    }
}
}
