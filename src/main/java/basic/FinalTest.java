package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class FinalTest {
    private static final int ONE_TWO_THREE = 123;//常量

    private final int i;//会报错，提示对变量i进行初始化

    public FinalTest(int i) {
        this.i = i;
    }

    public FinalTest() {
        i = 0;
    }

    public final void method(){
        System.out.println("test...");
    }
}

class SubFinalTest extends FinalTest{

}
