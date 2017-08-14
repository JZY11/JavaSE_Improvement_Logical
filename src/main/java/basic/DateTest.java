package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */

/**
 *  1. Date()  分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
 *  2.Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法
 *              Calendar 提供了一个类方法 getInstance，以获得此类型的一个通用的对象
 *  3.SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类,来自java.text包
 *                     它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(-1480000000000L);
        Date date2 = new Date(116, 2, 15);//已经过时
        System.out.println(date2);
        System.out.println(new Date().getTime());

        // 以日历的形式设置日期、时间
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 11, 16, 12, 0, 1);
        System.out.println(calendar.getTime());

        // 当前日期、时间
        Date date3 = new Date();
        System.out.println(date3);


        // SimpleDateFormat来自java.text包
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//传入指定的形式
        System.out.println(simpleDateFormat.format(date));

        SimpleDateFormat format = new SimpleDateFormat();
        System.out.println(format.format(date));
    }
}
