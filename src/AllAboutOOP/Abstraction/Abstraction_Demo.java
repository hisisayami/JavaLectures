package AllAboutOOP.Abstraction;

public class Abstraction_Demo extends Demotest{
    @Override
    void myMethod() {
        System.out.println("this override method");
    }

    public static void main (String[] args){
        Abstraction_Demo demo = new Abstraction_Demo();
        demo.myMethod();
    }
}

abstract class Demotest {

    //you cannot create an instance of an abstract class
    //can have method also as abstract method.
    //all abstract methods are by default public/ cannot have private abstract class
    //all abstract methods must be override by child class
    //you are not allowed to have body of method for abstract method


    abstract void myMethod();

        }

