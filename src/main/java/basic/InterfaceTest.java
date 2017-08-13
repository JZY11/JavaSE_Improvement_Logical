package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */
public interface InterfaceTest extends Aa,Bb,Cc,Dd{
    public static final int ZERO = 0;//接口中的域为公有的常量,方法默认的为公有的抽象方法
    String WINTER = "冬天";

    public abstract void method();//接口中的方法可以不写方法体

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new E();//通过new一个该接口的实现类，来实例化该接口
    }
}

interface Aa{
    void m1();
}

interface Bb{
    void m2();
}

interface Cc{
    void m3();
}

interface Dd{
    void m4();
}

class E implements InterfaceTest{
    @Override
    public void method() {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}

abstract class T{

}