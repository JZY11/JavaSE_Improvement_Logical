package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class LocalInnerClassTest {//内部类
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.print(1);
    }
}

class Outer{
    private int age = 18;

    public void print(int x){
        boolean b = true;
        if (b){
            class Inner{
                void inPrint(){
                    System.out.println(x);
                    System.out.println(age);
                }
            }
            new Inner().inPrint();
        }
    }
}
