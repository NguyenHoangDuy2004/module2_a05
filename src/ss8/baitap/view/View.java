package ss8.baitap.view;

import ss8.baitap.controller.CustomerController;
import ss8.baitap.model.Customer;

public class View {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        customerController.displayMenu();
    }

}
