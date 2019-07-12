package AllAboutOOP.Inheritance;

public class CodeTest_Inheritance {
    public static void main(String[] args) {
        Dog obj =  new Dog(13 ,34 ,"Lila");
        obj.color();


    }

}

class Animal {
    int age;
    int runSpeed;
    String name;

    public Animal(int age, int runSpeed, String name) {
        this.age = age;
        this.runSpeed = runSpeed;
        this.name = name;
    }

    public void move (){

    }



}

class Cat extends Animal{
    public Cat(int age, int runSpeed, String name) {
        super(age, runSpeed, name); //super calls all the variable from the parent class so that we don't have to intitialize in child class
    }
}

class Dog extends Animal {
    public Dog(int age, int runSpeed, String name) {
        super(age, runSpeed, name);
    }

    public void color(){
        System.out.println("This is void method of class cat");
    }
}