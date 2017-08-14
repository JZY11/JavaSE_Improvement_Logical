package basic;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class IfTest {
    // [90,100] A
    // [80,90) B
    // [60,80) C
    // [0,60) D
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        }else if(grade >= 60){
            System.out.println("C");
        }else if (grade >= 0){
            System.out.println("D");
        }
    }
}