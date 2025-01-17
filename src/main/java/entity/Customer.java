package entity;


import org.springframework.stereotype.Component;


@Component
public class Customer implements BuyingInterface{
    public String getName() {
        return name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void buy() throws InterruptedException {
        System.out.println(name + " совершает покупку.");
        Thread.sleep(1000);
    }

}
