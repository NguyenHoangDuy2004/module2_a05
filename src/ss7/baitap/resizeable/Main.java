package ss7.baitap.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(3.0,5.0);

        double percents = Math.random()*100+1;
        System.out.println("percents" + percents);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("before circle area: " + ((Circle) shape).getArea());
            } else if ( shape instanceof Rectangle) {
                System.out.println("before rectangle area: " + ((Rectangle) shape).getArea());
            }
        }
        System.out.println("AFTER");

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                IResizeable resCircle = (Circle) shape;
                resCircle.resize(percents);
                System.out.println("after circle area: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                IResizeable resRectangle = (Rectangle) shape;
                resRectangle.resize(percents);
                System.out.println("before rectangle area: " + ((Rectangle) shape).getArea());
            }
        }
    }
}
