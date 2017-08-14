package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class LogicalOperator {// 逻辑运算符
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2);// false
        System.out.println(b1 | b2);// true
        System.out.println(b1 ^ b2);//异或 true
        System.out.println(b1 && b2);// false 逻辑与
        System.out.println(b1 || b2);// true  逻辑或
        System.out.println(!b1);// false  非
        System.out.println(!b2);// true

        int x = 1;
        int y = 2;
        System.out.println((x > y) && (y++ > 0));
        System.out.println(y);
    }
}
