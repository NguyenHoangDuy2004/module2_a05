package demo.service.impl;

import demo.service.IStudentService;

import java.util.Scanner;

public class StudentService implements IStudentService {
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");

    }
}
