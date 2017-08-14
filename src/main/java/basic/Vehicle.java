package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class Vehicle {//交通工具
    double speed;
    String color;
    double price;
    double weight;

    //该类的无参默认构造方法
    public Vehicle() {
        System.out.println("vehicle constructor...");
    }

    //该类的有参构造方法
    public Vehicle(double speed, String color, double price, double weight) {
        this.speed = speed;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }
    void run(){//修饰符为default
        System.out.println("run...");
    }

    void stop(){
        System.out.println("stopped...");
    }
}
