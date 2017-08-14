package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class PrimitiveTest {//值传递 传递的是对象的副本，方法中对副本的改变不影响原来的值
    public static void test(String s){
        System.out.println("b: " + s);//  hi
        s = "hello";
        System.out.println("c: " + s);//  hello
    }

    public static void main(String[] args) {
        String s;
        s = "hi";
        System.out.println("a: " + s);// hi
        test(s);
        System.out.println("d: " + s);// hello - hi
    }
}
