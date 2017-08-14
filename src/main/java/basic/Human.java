package basic;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.io.Serializable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class Human extends Object implements Serializable {
    String name;

    int age;
    char gender;
    double height;
    double weight;
    boolean isMarried;

    /*
    public Human() {//构造方法 构造器 constructor
             //1. 没有返回类型
             //2. 方法名与类名相同
    }

    public Human(String name, int age, char gender, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }
     */

    public Human(String name, int age, char gender) {// 快捷键：Alt + Insert
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age, char gender, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }
    // Ctrl + Shift + '+' / '-' 代码折叠快捷键

    String study(int i,
                  String s){//形式参数   形参
        if (i == 1) {
            i =
                    1 + 2 + 3 + 4
                            + 5 + 6;
        }else {

        }
        int j;
        int k;
        return s + i;
    }

    int work() {
        study(1, "");// invoke method(引用方法) 实际参数  实参
        for (int i = 0; i < 10; i++) {
            if (height > 1.8) {
                return 1;
            }
        }
        /*
         *  Java comment:
         *  1. single line
         *  2. multi line
         *  3. Java doc
         */
        String s = "a";
        switch (s){
            case "a":
                System.out.println("a");
                // fall through 继续往下执行
            case"b":
                System.out.println("b");
                break;//中断
            default:
                //  .....
                break;
        }
        return 100;
    }

    public static void main(String[] args) {
        Human human = new Human("zhangsan", 18, '男', 1.7, 60, false);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.height);
        System.out.println(human.isMarried);

        human.study(1, "");
        human.work();

        System.out.println(human.work());
        System.out.println(human.study(2, "test"));
    }


    // 重写了父类的toString()方法
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", isMarried=" + isMarried +
                '}';
    }
}
