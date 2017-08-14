package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class VehicleTest {
    void m1(){
        // ...
    }

    void m2(){
        // ...
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(10,"white",500d,10d);
        Car car = new Car(100, "white", 300000, 15000, "fuel", 4);
        System.out.println(vehicle.color);
        System.out.println(car.color);
        System.out.println(car.powerType);
        System.out.println(car.tireNumber);

        Car carNew = new Car();
    }
}
