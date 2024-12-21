package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Staff implements SellingInterface{
    private String name;


    @Override
    public void sell() throws InterruptedException {
        System.out.println(name + " продаёт товар.");
        Thread.sleep(1000);

    }
}
