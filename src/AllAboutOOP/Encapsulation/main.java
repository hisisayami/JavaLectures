package AllAboutOOP.Encapsulation;

public class main {
    public static void main(String[] args) {

        //Car Obj1 = new Car ();

//        Obj1.setCarType("SUV");
//        Obj1.setEngineType("V6");
//        Obj1.setNoOfwheels(4);
//        Obj1.setPrice(5000);

        getCar("VAN", "V6", 4, 25000);


    }

    public static Car getCar (String type, String engineType, int w, int p){
         Car car = new Car ();
         car.setCarType(type);
         car.setEngineType(engineType);
         car.setNoOfwheels(w);
         car.setPrice(p);
        System.out.println(car.hashCode());
        System.out.println(car);
        return car;
    }
}
