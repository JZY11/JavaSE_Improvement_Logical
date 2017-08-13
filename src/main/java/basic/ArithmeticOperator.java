package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */
public class ArithmeticOperator {//算术运算符
    public static void main(String[] args) {
        int x = 1;//定义整型变量并为其赋值
        int y = 2;

        int z;
//        z = x - y;
//        z = x * y;
//        z = x / y;// 取整(去余)运行比如5/2=2   9/6=1   而5.0/2=2.5  9.0/6=1.5
        z = x % y;// % 只能用于整数表示取余数
        System.out.println(z);

        System.out.println(1d / 2d);

        System.out.println("------");
        x++;// x = x + 1;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        y--;
        System.out.println(y--);

        System.out.println("+++++");
        System.out.println(100 % 3);
        System.out.println(1 / 0d);
        System.out.println(1 + 1 + "1" + 1 + 1);//字符串的拼接
    }
}
