package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */
public class AccessModifierTest {

//    域 fields
    public double pi = 3.1415926;//可以被共享所以修饰符可以是：public

    private int x;
    private int y;

    private boolean b;

    int i;//默认修饰符为default
    protected String s;
    public double d;

    //methods  方法
    private void someMethod(){
        //没有方法体
    }

    public void divid(){//方法有返回值类型，但没有返回值
        System.out.println(x / y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y == 0) {
            System.out.println("/ by zero!");
            System.exit(0);
        }
        this.y = y;
    }

    private void m1(){
        b = true;
    }
}
