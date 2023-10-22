package ss18.baitap.validate_so_dien_thoai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập số điện thoại : ");
        String phoneNumber = new Scanner(System.in).nextLine();

        if (ValidatePhoneNumber.validate(phoneNumber)){
            System.out.println("Số điện thoại : " +phoneNumber+ "là hợp lệ");
        }else {
            System.out.println("Số điện thoại : " +phoneNumber+ "là không hợp lệ");
        }
    }
}
