package test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/23.
 * JavaSE_Improvement_Logical.
 */
public class T1 {
    private static int counter;
    public static void main(String[] args) {
        String s1 = "1,3,5,6,7,8";
        String s2 = "2,4,1,7,5";
        if (s1.length() > s2.length()) {// 始终以s1为标准，若s1长度大于s2，则交换下
            String temp = s2; //temporary 临时的
            s2 = s1;
            s1 = temp;
        }
//        String[] strings1 = s1.split(",");
//        for (String s : strings1) {
//            if (s2.contains(s)){
//                counter++;
//            }
//        }
//        System.out.println(strings1.length - counter);
        String[] strings1 = s1.split(",");
        String[] strings2 = s2.split(",");
        for (int i = 0; i < strings1.length; i++) {
            if (strings1[strings1.length - 1 - i].equals(strings2[strings2.length -1 -i])) {
                counter++;
            }
            System.out.println(counter);
        }
    }
}
