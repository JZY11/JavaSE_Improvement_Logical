package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/15.
 * JavaSE_Improvement_Logical.
 */
//打印出如下图案（菱形）
//        x
//       xxx
//      xxxxx
//     xxxxxxx

//      xxxxx
//       xxx
//        x
//        要求只使用以下三种语句
//        1. System.out.print(" ");
//        2. System.out.print("x");
//        3. System.out.println("x");
// n 奇数
public class E19 {
    private static final int N = 77;

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < ((i < N / 2 + 1) ? (N / 2 - i) : (i - N / 2)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((i < N / 2 + 1) ? (i * 2) : ((N - 3) - (2 * i - N - 2))); k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
