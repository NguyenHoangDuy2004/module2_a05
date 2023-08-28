package ss6.baitap.circle_va_cylinder;

public class Circle {
    private double radius  ;
    private String color   ;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "A circle with "
                + getRadius()
                +" and the color is "
                + getColor();
    }
}
