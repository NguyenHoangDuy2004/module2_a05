package demo.controller;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);


    private static void displayMenu(){
        boolean flag = true ;
        do {
            System.out.println("----- Chọn chức năng theo số -----");
            System.out.println("1. Thêm mới sinh viên. " +
                    "\n 2. Xóa sinh viên. " +
                    "\n 3. Xem danh sách sinh viên. " +
                    "\n 4. Xem thông tin giáo viên. " +
                    "\n 5. Tìm kiếm sinh viên. " +
                    "\n 6. Thoát. "
            );

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    System.out.println("Thêm mới");
                    break;
                case 2 :
                    System.out.println("Xóa sinh viên");
                    break;
                case 3 :
                    System.out.println("Hiển thị danh sách");
                    break;
                case 4 :
                    System.out.println("hiển thị thông tin giáo viên");
                    break;
                case 5 :
                    System.out.println("Tìm kiếm ");
                    break;
                default:
                    flag = false ;
            }
        }while (flag);

    }
}
