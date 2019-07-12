package AllAboutOOP.Inheritance;

public class Inheritance_INtro extends A {

    double d1; //this var can be called in child but not in parent


    ////Child class
    public static void main(String[] args) {

        //these are non-static variable from parent class
        Inheritance_INtro intro = new Inheritance_INtro();
        intro.id = 15;
        intro.sum = 55;
        intro.total = 95;
        intro.sumOfall(4,6,8);
        intro.d1 = 4.99;


        //these are static variable from parent class
        int n = Inheritance_INtro.numOne;
        int a1 = A.numOne;
    }
}


/////Parent class
class A {
    int id;
    int sum;
    int total;

    static int numOne;

    public void sumOfall(int a, int b, int c){
        this.id = a;
        this.sum = b;
        this.total = c;

        System.out.println(a + b + c);
    }
}
