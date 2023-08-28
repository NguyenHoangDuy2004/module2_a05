package ss7.baitap.colorable;

public class Square extends Rectangle implements IColorable {
    private double side ;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side,String color, Boolean filled) {
        super(color,filled,side,side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return " A Square with side = " + getSide() + " which is a subclass of " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
