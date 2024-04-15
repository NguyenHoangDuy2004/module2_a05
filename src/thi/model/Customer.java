package thi.model;

public class Medical{
    private int number    ;
    private int id        ;
    private String name   ;
    private int dayIn     ;
    private int dayOut    ;
    private String reason ;

    public Medical() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayIn() {
        return dayIn;
    }

    public void setDayIn(int dayIn) {
        this.dayIn = dayIn;
    }

    public int getDayOut() {
        return dayOut;
    }

    public void setDayOut(int dayOut) {
        this.dayOut = dayOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Medical{" +
                "number=" + number +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", reason='" + reason + '\'' +
                '}';
    }
}
