package Class_Definition;

public class Demo {

    int numOne;
    static int numTwo;

    public static void getNum(){
        Demo d = new Demo();
        d.numOne = 12;

        numTwo = 10;
    }

    public void getSomeInfo(){
        numOne = 20;
        numTwo = 30;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
