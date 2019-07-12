package AllAboutOOP.Polymorphism;

public class OverRideVsOverLoad {
    public static int addNum(int a, int b){
        System.out.println(a + b);
        System.out.println("this is an int");
        return a + b;
    }

    //over load addNUm method..

    public static long addNum (long a, long b){
        System.out.println(a + b);
        System.out.println("this is  long");
        return a +b;
    }

    public static void main (String[] args){
        addNum(3,5);
        addNum(4L,8L);
    }
}
