package ss8.baitap.repository;

import ss8.baitap.model.Customer;

import java.util.LinkedList;

public interface ICustomerRepository {
    LinkedList<Customer> getListCustomer();
    void addCustomer(Customer customer);
    void deleteCustomerById(int id);

}
