/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */

/**
 *  How to convert a char to a string?
 *  1.Character.toString(char)
 *  2.String.valueOf(char)
 *  3.string connection  eg: String s = "" + 's';
 */
public class CharTest {// 字符
    public static void main(String[] args) {
        char c1 = 1;// 1.
        char c2 = 'A';//2. a - 97; A - 65
        char c3 = '\123';
        char c4 = '\u4e00';// unicode [/u4E00,/u9FBB]
        char c5 = '\t';//5. t  - Tab 也占一个字符
        char[] chars = {'a','b','c','d'};

        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println(c3);
        System.out.println((int) '中');
        System.out.println(c5);
        System.out.println("test");
        System.out.println("------------");

        System.out.println(Character.toString(c2));
        System.out.println("a");
        System.out.println("b");
    }
}
