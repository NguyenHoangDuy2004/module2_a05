package ss15.baitap;

public class IllegalTriangleException extends Throwable{
    private String mess;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String mess) {
        System.out.println(mess);
    }
}
