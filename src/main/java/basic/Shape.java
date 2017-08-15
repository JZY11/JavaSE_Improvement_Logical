package basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/8/14.
 * JavaSE_Improvement_Logical.
 */

/**
 * 当一个方法为抽象方法时，意味着这个方法必须被子类的方法所重写，否则其子类的该方法仍然是abstract的，
 * 而这个子类也必须是抽象的，即声明为abstract。 抽象类中不一定包含抽象方法，但是包含抽象方法的类一定要被声明为抽象类。
 * 抽象类本身不具备实际的功能，只能用于派生其子类。抽象类中可以包含构造方法，但是构造方法不能被声明为抽象。
 * 调用抽象类中的方法(抽象方法和非抽象方法)，如果方法是static的，直接 抽象类.方法  就可以了；
 * 如果是非static的则必须需要一个继承的非抽象类，然后用这个非抽象类的实例来调用方法。
 */
public abstract class Shape {
    //抽象方法就是以abstract修饰的方法，这种方法只声明返回的数据类型、方法名称和所需的参数，
    // 没有方法体，也就是说抽象方法只需要声明而不需要实现
    //
    public abstract double getPerimeter();

    public abstract double getArea();
}

class Square extends Shape{
    double length;// 边长

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a + b) <= c || (b + c) <= a || (a + c) <= b){
            System.out.println("error");
            System.exit(0);//退出程序
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Square square = new Square(1.5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Rectangle rectangle = new Rectangle(1d, 2d);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(1d);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(2d, 2d, 3d);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
