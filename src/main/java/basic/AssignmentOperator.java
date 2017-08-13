package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */

/**
 * java的运算符可以分为四类：算数运算符，关系运算符，逻辑运算符，位运算符
 * 算数运算符可分为：一元运算符和二元运算符，一元运算符有一个操作数
 * 一元运算符：+， -， ++， --
 * 二元运算符：+，-，*，/, %(取余)，
 * 关系运算符：==，!=, >, >=, <, <=
 * 逻辑运算符：逻辑与(&&), 逻辑或(||), 逻辑非(!), 逻辑异或(^), 逻辑与(&), 逻辑或(|)
 */
public class AssignmentOperator {//赋值运算符
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);
        x += 100;//x = x + 100
        System.out.println(x);
        x -= 100;
        System.out.println(x);
        x *= 100;
        System.out.println(x);
        x /= 100;
        System.out.println(x);
        x %= 100;
        System.out.println(x);

        x ^= 100;//x = x & 100 位运算
        //        0000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(0b1100100);
        System.out.println(x);

        boolean y = true;
        System.out.println(y);
        y &= false;//y = y & false &逻辑与相当于and
        System.out.println(y);//false
        y |= true;// |表示逻辑或
        System.out.println(y);//true
        y ^= false;//逻辑异或
        System.out.println(y);

        //二元赋值运算符
        // x ?= y 等价于 x = x ? y

        //三目运算符
        // 表达式1?表达式2:表达式3; 如：min=(a<b)?a:b;
    }
}
