package AllAboutOOP.Polymorphism;

public class Polymorphism_Intro {
    /*
    1.Dynamic binding (Method Override)- overriding happens in diff class/ run time/ cannot change return type
    2.Static binding (Method Overload) - overloading happens in same class / compiler time/better performance/ can change return type
     */

    //example of method override
    public static void main(String[] args) {
        Animal a1 = new Cat ();
        a1.makeNoise();

        Animal a2 = new Dog();
        a2.makeNoise();

    }

}

class Animal {
    public void makeNoise(){
        System.out.println("Some sound..");
    }
}

class Dog extends Animal {
    public void makeNoise(){
        System.out.println("Dog sound..");
    }
}

class Cat extends Animal{
    public void makeNoise(){
        System.out.println("Cat sound..");
    }

}
