package test;

import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/24.
 * JavaSE_Improvement_Logical.
 */
/*
   找出字符串中出现最多的字母和出现的次数
 */
public class T2 {
//    public static void main(String[] args) {//(1):郅超idea  有瑕疵，最多字母数目相同时，只能输出来一个字母
//        String s = "aabbbcccccdefffffffff";
//        int max = 0;
//        char c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int n = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    n++;
//                }
//            }
//            if (n > max) {
//                max = n;
//            }
//        }
//           for (int i = 0; i < s.length(); i++) {
//            int n = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    n++;
//                }
//            }
//        if(n == max){
//        System.out.println(s.charAt(i));
//    }

    public static void main(String[] args) {//(2):李老师idea
        String s = "aabbbcccccdefffff";
        Hashtable<Character,Integer> hashtable = new Hashtable<>();//**哈希表键不能重复
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashtable.put(c,hashtable.get(c) == null ? 1 : hashtable.get(c) + 1);
        }
        //获取字母最多的个数
        int max = Collections.max(hashtable.values()); // 1  ***

//        int max = 0;// 2
//        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {// 2
//            if (max < entry.getValue()){
//                max = entry.getValue();
//            }
//        }
        System.out.println(max);
        System.out.println(hashtable);
        //获取个数最多的字母
        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
