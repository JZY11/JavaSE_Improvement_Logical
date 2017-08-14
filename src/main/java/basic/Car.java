package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class Car extends Vehicle{

    String powerType;//动力车型
    int tireNumber;//车轮个数

    public Car(String powerType, int tireNumber) {
        this.powerType = powerType;
        this.tireNumber = tireNumber;
    }

    public Car(double speed, String color, double price, double weight, String powerType, int tireNumber) {
        super(speed, color, price, weight);//子类继承父类，子类若想初始化则应先父类初始化
        this.powerType = powerType;
        this.tireNumber = tireNumber;
    }

    // 隐式  显示

    Car(){
        // super()
    }

    void addOil(){

    }

    void charge(){

    }

}
