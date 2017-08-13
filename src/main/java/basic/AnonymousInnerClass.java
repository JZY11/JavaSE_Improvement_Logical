package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */
public class AnonymousInnerClass {//匿名内部类
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass() {
            @Override
            void method() {
                System.out.println("new test...");
            }
        };
        superClass.method();

        InterfaceTest interfaceTest = new InterfaceTest() {//接口是不能被实例化的啊，你只是实例化的接口的实现类
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
        };
    }
}
abstract class SuperClass{//抽象类
    abstract void method();//抽象方法
}
