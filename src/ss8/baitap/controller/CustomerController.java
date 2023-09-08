package ss8.baitap.controller;

import ss8.baitap.service.ICustomerService;
import ss8.baitap.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private CustomerService customerService = new CustomerService();
    public void displayMenu(){

        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng theo số :");
            System.out.println("1.Display" +
                    "\n 2.Add" +
                    "\n 3.Edit" +
                    "\n 4.Delete" +
                    "\n 5.Exit"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("hiện thị");
                    customerService.display();
                    break;
                case 2:
                    System.out.println("thêm mới");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("Sửa");

                    break;
                case 4:
                    System.out.println("Xóa");
                    customerService.delete();
                    break;
                default:
                    flag = false;
            }
        }while (flag);

    }

}
