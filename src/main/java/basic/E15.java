package basic;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/15.
 * JavaSE_Improvement_Logical.
 */
// 输入三个整数x，y，z，请把这三个数由小到大输出。
public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int x = scanner.nextInt();
        System.out.println("请再输入一个整数: ");
        int y = scanner.nextInt();
        System.out.println("请再输入一个整数: ");
        int z = scanner.nextInt();

        // x = 10; y = 1
        if (x > y) {
            int t = x;// 10
            x = y;
            y = t;
        }
        if (x > z) {
            int t = x;
            x = z;
            z = t;
        }

        if (y > z) {
            int t = y;
            y = z;
            z = t;
        }

        System.out.println(x + ", " + y + ", " + z);
    }
}
