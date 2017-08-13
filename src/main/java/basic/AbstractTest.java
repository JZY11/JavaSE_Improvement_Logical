package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */
public abstract class AbstractTest {
    public abstract void method();
    public abstract String test(int i,boolean b);

    public void m(){

    }

    public static void main(String[] args) {
        System.out.println("test....");
//        AbstractTest abstractTest = new AbstractTest();抽象类不能被实例化
        SubAbstractTest subAbstractTest = new SubAbstractTest();//因为不是抽象类所以可以被实例化
    }
}
class SubAbstractTest extends AbstractTest{//子类继承抽象类必须实现抽象类中抽象的方法
    @Override
    public void method() {

    }

    @Override
    public String test(int i, boolean b) {
        return null;
    }

}
