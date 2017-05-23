package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/24.
 * JavaSE_Improvement_Logical.
 */
/*
   拆分字符串，字符串中含有逗号和数字，对数字排序并输出
   例如：String s0 = "123,45,25,85";
      输出：25 45 85 123
 */
public class T3 {
    public static void main(String[] args) {
        String s = "123,45,25,85";
        String[] strings = s.split(",");//字符串的拆分变为字符串数组
//        List<String> list = Arrays.asList(strings);// ??
//        Collections.sort(list);// ??
//        Arrays.sort(strings);不可以，字符串不可以排序，可转换为整数类型就可以了


        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.print(anInt + " ");// 此循环是为了去掉两边的中括号的
        }
        System.out.println(Arrays.toString(ints));
    }
}
