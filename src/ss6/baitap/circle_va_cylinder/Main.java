package ss6.baitap.circle_va_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0 , "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(2.0 , "blue", 3.0);
        System.out.println(cylinder);
    }
}
