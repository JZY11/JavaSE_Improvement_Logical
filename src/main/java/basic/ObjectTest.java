package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */
public class ObjectTest {

    private Integer id;
    private String name;
    private int age;
    private boolean married;
    private double height;

    public ObjectTest(Integer id, String name, int age, boolean married, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.married = married;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest(1, "zhangsan", 18, false, 1.7d);
        System.out.println(objectTest);
    }
}
