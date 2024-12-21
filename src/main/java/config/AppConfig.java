package config;


import entity.Customer;
import entity.Product;
import entity.Staff;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("entity")

public class AppConfig {

    @Bean
    Customer customer(){
        Customer customer = new Customer();
        customer.setName("Mike");
        return customer;
    }
    @Bean
    Staff staff(){
        Staff staff = new Staff();
        staff.setName("Simon");
        return staff;
    }
    @Bean
    Product product(){
        Product product = new Product();
        product.setCustomer(customer());
        product.setStaff(staff());
        product.setPrice(100.3);
        product.setWeight(30);
        product.setTitle("Пила");
        return product;
    }
}
