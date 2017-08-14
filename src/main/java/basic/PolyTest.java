package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class PolyTest {
    double d;
    boolean b;

    public PolyTest() {
    }

    public PolyTest(boolean b) {
        this.b = b;
    }

    public PolyTest(double d) {
        this.d = d;
    }

    public PolyTest(double d, boolean b) {
        this.d = d;
        this.b = b;
    }
    // overload 重载

    void test(String s, int i){
        // ...
    }

    int test (int j, String string){
        return 0;
    }

    public static void main(String[] args) {
        PolyTest polyTest = new PolyTest();
        polyTest.test("test", 1);
    }
}

class Father extends Object{
    void method(int i){
        System.out.println("method in father class....");
    }
}

class Son extends Father{
    @Override
    void method(int i) {// 重写了父类Father的method()方法
//        super.method(i);
        System.out.println("method in son class...");
    }
}

class PolyDemo{
    public static void main(String[] args) {
        Father father = new Father();
        father.method(1);
        Son son = new Son();
        son.method(0);
    }
}
