package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Customer implements BuyingInterface{
    private String name;



    @Override
    public void buy() throws InterruptedException {
        System.out.println(name + " совершает покупку.");
        Thread.sleep(1000);
    }

}
