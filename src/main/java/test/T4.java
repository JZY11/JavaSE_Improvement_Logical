package test;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/24.
 * JavaSE_Improvement_Logical.
 */
/*
   输入一段字符串，字符串中值包含大小写字母。要求完成函数删除给定字符串中中
   出现次数最少的字符。输出删除完的字符串。如果有多个出现次数一样的字符，都为最少时，一并删除
   例如：输入：abbccd
         输出：bbcc
 */
public class T4 {
    public static void main(String[] args) {
        String s = "abcbcd";
         //以下方法不可以
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for (char c : s.toCharArray()) {
            hashtable.put(c,hashtable.get(c) == null ? 1 : hashtable.get(c) + 1);
        }
        System.out.println(hashtable);
        int min = Collections.min(hashtable.values());
        System.out.println(min);// 以上求得字符最短的个数

        //用StringBuffer来做是因为其有个方法叫：deleteCharAt()而字符串没有
        StringBuffer stringBuffer = new StringBuffer(s);// 将字符串转化为字符串缓冲区StringBuffer

        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (entry.getValue() == min) {// 报错，不能在循环中remove()
//                hashtable.remove(entry.getKey());
                System.out.println(entry.getKey());// 输出a和d两个字母

                for (int i = 0; i < stringBuffer.length(); i++) {
                   if( stringBuffer.charAt(i) == entry.getKey()){
                       stringBuffer.deleteCharAt(i);
                   }
                    
                }
            }
        }
        System.out.println(stringBuffer);
    }
}
