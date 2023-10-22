package ss18.baitap.validate_lop_hoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập tên lớp : ");
        String nameClass = new Scanner(System.in).nextLine();

        if (ValidateClass.validate(nameClass)){
            System.out.println("tên lớp : " +nameClass+ "là hợp lệ");
        }else {
            System.out.println("tên lớp : " +nameClass+ "là không hợp lệ");
        }
    }
}
