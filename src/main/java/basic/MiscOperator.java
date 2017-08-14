package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class MiscOperator {
    public static void main(String[] args) {
        char c = '中';
        int i = c;
        System.out.println(i);

        int j = 100000;
        char x = (char)j;//强制转换时有风险的
        System.out.println((int)x);// a:97  d

        int z = (1 + 2) * 3 / (4 % 6);
        System.out.println(z);// 2

        System.out.println(4 % 6);

        int n = 123456789;
        double d = n;
        System.out.println(d);
    }
}
