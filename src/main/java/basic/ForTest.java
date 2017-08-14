package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class ForTest {
    public static void main(String[] args) {
        long start = System.nanoTime();//System类调用nanoTime()方法，返回一个long型

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += (i + 1);
            if (i == 5){
                break;//中断
//                continue;
            }
//            System.out.println(i);
            System.out.println(result);
        }
            System.out.println(result);
        System.out.println("total time: " + (System.nanoTime() - start));
    }
}
