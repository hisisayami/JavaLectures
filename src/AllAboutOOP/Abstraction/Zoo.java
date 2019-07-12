package AllAboutOOP.Abstraction;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.move();
        dog.run();
        dog.swim();

        Animal horse = new Horse();
        horse.move();
        horse.swim();
        horse.run();
    }

}

abstract class Animal{

    abstract void move();

    abstract void run();

    abstract void swim();


}

class Dog extends Animal{
    @Override
    void move() {

    }

    @Override
    void run() {

    }

    @Override
    void swim() {

    }
}

class Horse extends Animal{
    @Override
    void move() {

    }

    @Override
    void run() {

    }

    @Override
    void swim() {

    }
}
