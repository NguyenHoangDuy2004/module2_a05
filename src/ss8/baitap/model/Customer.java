package ss8.baitap.model;

import java.util.Objects;

public class Customer {
    private int id ;
    private String name  ;
    private int price ;
    private String product ;

    public Customer() {
    }

    public Customer(int id, String name, int price, String product) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.product = product;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        Customer customer = (Customer) o;
        return id == customer.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", product='" + product + '\'' +
                '}';
    }
}
