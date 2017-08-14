package basic;

import java.util.Calendar;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class CalendarTest {// 日历
    private static final int YEAR = 2017;

    private static void printMonth(int month){
        System.out.println("\n\n\t" + YEAR + "年" + (month + 1) + "月");
        System.out.println("一\t" + "二\t" + "三\t" + "四\t" + "五\t" + "六\t" + "日\t");
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR,month,1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 0; i < (5 + dayOfWeek) % 7; i++) {
            System.out.println("\t");
        }// 1 - 6 2- 0 3 - 1 4 - 2 5 - 3 6 - 4 7 - 5

        int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < dayOfMonth; i++) {
            System.out.printf("%2d", i + 1);
            System.out.print("\t");
            if ((i + 1 + (5 + dayOfWeek) % 7) % 7 == 0){
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            printMonth(i);
        }
    }
}
