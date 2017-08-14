package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */

/**
 * 三目运算符 (conditions)?method1:method2
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int z = (x < y) ? x * y : x / y; //(true/false)?true value:false value



        // 思考是学习之父
        // 重复时学习之母
        System.out.println(z);
    }
}
