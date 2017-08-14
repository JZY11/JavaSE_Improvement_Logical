package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class Inheritance {
    public static void main(String[] args) {
        D d = new D();
        d.d();
        d.c();
        d.b();
        d.a();
        // 判断d是否是类A的实例
        System.out.println(d instanceof A);
    }
}
class A{
    void a(){
        System.out.println("a....");
    }
}
class B extends A{
    void b(){
        System.out.println("b....");
    }
}
class C extends B{
    void c(){
        System.out.println("c...");
    }
}
class D extends C{
    void d(){
        System.out.println("d....");
    }
}
