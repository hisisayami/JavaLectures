package Operators.Operators.Comma_Operator;

public class Comma_Intro {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + "j= " + j);

        }
    }
}
