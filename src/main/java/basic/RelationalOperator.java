package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x == y);
        System.out.println(x != y);

        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);// == 比较的是两个对象的内容值
    }
}
