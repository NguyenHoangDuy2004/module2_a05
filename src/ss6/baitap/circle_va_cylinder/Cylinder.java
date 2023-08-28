package ss6.baitap.circle_va_cylinder;

public class Cylinder extends Circle{
    private double height ;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2);
    }
    @Override
    public String toString() {
        return "A Cylinder with "
                + getHeight()
                +" and radius is "
                +getRadius()
                +" and the color is "
                +getColor();
    }
}
