package AllAboutOOP.Encapsulation;

public class Encapsulation_Intro extends Encap {
    public static void main(String[] args) {
        Encap obj = new Encapsulation_Intro();

    }

}

class Encap {
    private int SSN;
    private int DOB;

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
}
