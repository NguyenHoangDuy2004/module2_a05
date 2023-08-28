package ss6.baitap.point_va_moveablePoint;

public class Point {
    private float x ;
    private float y ;

    public Point() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){

    }

    public float[] getXY(){
        float[] arr = {getX() , getY()};
        return arr ;
    }


}
