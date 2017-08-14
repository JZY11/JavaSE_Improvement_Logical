package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */

/**
 * 初始化类的域为默认值:
     布尔类型默认值 false
     基本数值类型 0 或 0.0
     引用数据类型 null
 */

/**
 * 变量作用域范围
 变量（方法）产生作用的有效范围
   类作用域范围
      类的起始 { 到类的终止 }
      类的域和方法
   块 block 作用域范围
      从变量声明之处，到当前块结束之处
      方法中的局部变量 local variable，方法的参数，循环的变量
   方法内的局部变量可以覆盖同名的域
 */
public class ClassScopeTest {// 变量作用域范围
    private int i;
    private String s;

    public void method(double d){
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }
//        for (int j = 0; j < 100; j++) {
//            System.out.println(j);
//        }
        boolean b = false;
        System.out.println(d);

        String i = "hi";//方法内的局部变量可以覆盖同名的域
        System.out.println(this.i);//this表示当前类 因为变量i为整型变量int型没有被初始化，所以默认为0
        System.out.println(i);
        s = "hello";
        System.out.println(b);
    }

    public static void main(String[] args) {
        ClassScopeTest classScopeTest = new ClassScopeTest();
        classScopeTest.method(0d);
    }
}
