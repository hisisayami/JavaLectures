package AllAboutOOP.Inheritance;

public class Inheritance_Test {

    public static void main(String[] args) {

        MountainBike bike = new MountainBike(2,4,6);
        bike.setSeatheight(5);

    }
}

class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;

    }

    public void applyBrake(int decrement){
        speed -= decrement;


    }

    public void speedUp(int increment) {
        speed -= increment;

    }

    //Press Command + n
    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

class MountainBike extends Bicycle{
    int seatheight;

    public MountainBike(int gear, int speed, int seatheight) {
        super(gear, speed);
        this.seatheight = seatheight;

        System.out.println("Gear" + gear + "\n" + "speed" + speed + "\n" + "seatHeight" + seatheight);
    }

    public void setSeatheight(int value){
        this.seatheight =value;
        System.out.println(seatheight);
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatheight=" + seatheight +
                '}';
    }
}
