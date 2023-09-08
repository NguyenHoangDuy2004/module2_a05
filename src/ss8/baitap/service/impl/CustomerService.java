package ss8.baitap.service.impl;

import ss8.baitap.model.Customer;
import ss8.baitap.repository.ICustomerRepository;
import ss8.baitap.repository.impl.CustomerRepository;
import ss8.baitap.service.ICustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {

    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void display() {
       LinkedList<Customer> customers = customerRepository.getListCustomer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers != null) {
                System.out.println((1 + i) + "." + customers);
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giá trị");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập sản phẩm");
        String product = scanner.nextLine();
        Customer customer = new Customer(id, name, price, product);
        customerRepository.addCustomer(customer);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập Id cần xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        customerRepository.deleteCustomerById(deleteId);
    }
}

