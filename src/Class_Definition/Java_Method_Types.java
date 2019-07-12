package Class_Definition;

public class Java_Method_Types {

    //we also declare the Method/function in class

    //Types of Method/Function in Java
    //1. Static vs non-Static
    //2. void vs non-void
    //3. with parameter vs without parameter

    public static void main(String[] args) {
        getRefB();

        //calling constructor in java..
        Java_Method_Types objOne = new Java_Method_Types();
        objOne.getinfo();

    }

    //1. Static vs non-static
        //Static method are only allowed call via another static method

    public static void getRefA(){
        System.out.println("this is A");
    }
     public static void getRefB(){
        getRefA();

     }

     public void getinfo() {
         System.out.println("This is non-static method..");
         getRefA(); //(SELF NOTE: calling static method in a non static method)
     }

     //class constructor
    //1. it will always same name as class name.
    //2. it will never be static or non-static
    //3. it will never be void or non void
    //4. with args and without args...

    public Java_Method_Types(){
        System.out.println("This is s constructor...");
    }
}
