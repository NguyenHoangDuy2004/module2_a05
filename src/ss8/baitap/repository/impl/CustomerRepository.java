package ss8.baitap.repository.impl;

import ss8.baitap.model.Customer;
import ss8.baitap.repository.ICustomerRepository;

import java.util.LinkedList;

public class CustomerRepository implements ICustomerRepository {
    private static LinkedList<Customer> customersArryList = new LinkedList<>();

    static {
        customersArryList.add(new Customer(1, "duy1",1000, "Box1"));
        customersArryList.add(new Customer(2, "duy2",1000, "Box2"));
        customersArryList.add(new Customer(3, "duy3",1000, "Box3"));
        customersArryList.add(new Customer(4, "duy4",1000, "Box4"));
    }

    @Override
    public LinkedList<Customer> getListCustomer(){
        return customersArryList;
    }

    @Override
    public void addCustomer(Customer customer){
        customersArryList.add(customer) ;
    }



    @Override
    public void deleteCustomerById(int id) {
        for (int i = 0 ; i < customersArryList.size() ; i++){
            if (customersArryList.get(i).getId() == id){
                customersArryList.remove(i);
                break;
            }
        }
    }


}
