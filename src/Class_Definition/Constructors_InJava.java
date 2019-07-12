package Class_Definition;

import java.sql.SQLOutput;

public class Constructors_InJava {
    String name;

    //Creating Constructors in Java

    //types of Constructors in java
        //1. Default
        //2.No-args
        //3. Parameterized


    //No-Arg
    public Constructors_InJava(){
        this.name = "Test Java Constructor!!"; // 'this' means any global variable inside that class


    }

    //Parameterized
    public Constructors_InJava(String name){
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {

        Constructors_InJava obj = new Constructors_InJava(); //calling constructor without parameter in main
        System.out.println(obj.name);

        Constructors_InJava objOne = new Constructors_InJava(  "Test"); //calling constructor with parameter in main
    }
}
