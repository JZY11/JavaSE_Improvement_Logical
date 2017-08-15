package basic;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/15.
 * JavaSE_Improvement_Logical.
 */

// 输入某年某月某日，判断这一天是这一年的第几天？
// (闰年： 西元年份除以400余数为0的，或者除以4余数为0且除以100余数不为0的，为闰年)
public class E14 {

    private static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static boolean liLeapYear(int year){
        return (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year: ");
        int year = scanner.nextInt();
        System.out.println("intput month: ");
        int month = scanner.nextInt();
        System.out.println("input day: ");
        int date = scanner.nextInt();

        if(liLeapYear(year)){
            monthDays[1] = 29;
        }
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += monthDays[i];
        }
        System.out.println(sum + date);

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.DAY_OF_YEAR);
    }
}
