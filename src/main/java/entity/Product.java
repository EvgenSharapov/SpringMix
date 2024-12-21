package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Product implements ProductInterface{
    private Integer weight;
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
