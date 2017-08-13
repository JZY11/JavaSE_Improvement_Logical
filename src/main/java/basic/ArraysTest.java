package basic;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/13.
 * JavaSE_Improvement_Logical.
 */

/**
 *  byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
 */
public class ArraysTest {//数组
    public static void main(String[] args) {
//        int[] anArray = new int[10];(1)
//        先定义数组的初始容量值，然后再初始化
//        anArray[0] = 100; // initialize first element
//        anArray[1] = 200; // initialize second element
//        anArray[2] = 300; // and so forth


        //快捷语法创建和初始化一个数组
        int[] ints = {1, 100, 23, -34, 79, 40};//(2)整型数组

        //工具类Arrays的sort方法：对指定的 int 型数组按数字升序进行排序。

        Arrays.sort(ints);
        for (int anInt : ints) {//iter迭代循环
            System.out.println(anInt);
        }


        //返回指定数组内容的字符串表示形式
        System.out.println(Arrays.toString(ints));
    }
}
