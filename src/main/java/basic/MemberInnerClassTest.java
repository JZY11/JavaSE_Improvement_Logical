package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class MemberInnerClassTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.print();
    }
}

class OuterClass{
    private static int age = 18;

    static void m(){
        age = 19;
    }

    static class InnerClass{
        void print(){
            System.out.println(age);
        }
    }
}
