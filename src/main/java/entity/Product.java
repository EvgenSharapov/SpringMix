package entity;

import org.springframework.stereotype.Component;

@Component

public class Product implements ProductInterface{
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    private Double price;
    private String title;
    private Customer customer;
    private Staff staff;


    @Override
    public void soldOut() {
        System.out.printf("%s ценой %f и весом %d купил %s\n",title,price,weight,customer.getName());

    }

    @Override
    public void boughtIt() {
        System.out.printf("%s ценой %f и весом %d продал %s\n",title,price,weight,staff.getName());

    }
}
