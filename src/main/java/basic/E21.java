package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/15.
 * JavaSE_Improvement_Logical.
 */
// 求1+2!+3!+…+20!的和
public class E21 {

    long factorial(int n){// factorial:阶乘
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        long sum = 0;
        E21 e21 = new E21();
        for (int i = 0; i < 21; i++) {
            sum += e21.factorial(i + 1);
        }
        System.out.println("sum: " + sum);
    }
}
